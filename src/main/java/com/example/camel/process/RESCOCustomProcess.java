package com.example.camel.process;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.example.camel.model.Folio;
import com.example.camel.model.ResFolioToDB;
import com.example.camel.model.ResInfoFolio;
import com.example.camel.repo.FolioRepository;

public class RESCOCustomProcess implements Processor {
	@Autowired
	FolioRepository folioRepository;

	@Override
	public void process(Exchange exchange) throws Exception {
		ResInfoFolio resChangeFolio = null;
		StringReader stringReader = new StringReader(exchange.getIn().getBody(String.class));
		JAXBContext jaxbContextResponse = JAXBContext.newInstance(ResInfoFolio.class);
		Unmarshaller unmarshaller = jaxbContextResponse.createUnmarshaller();
		resChangeFolio = (ResInfoFolio) unmarshaller.unmarshal(stringReader);
		exchange.getOut().setBody(resChangeFolio);

	}

	public ResInfoFolio processResponse(ResInfoFolio resInfoFolio) {
		if (resInfoFolio.getFolioList() != null) {
			if (resInfoFolio.getFolioList().getFolio() != null) {
				Folio folio = resInfoFolio.getFolioList().getFolio();
				Mapper mapper = new DozerBeanMapper();
				ResFolioToDB resFolio = mapper.map(folio, ResFolioToDB.class);
				folioRepository.save(resFolio);
			}

		}
		return resInfoFolio;

	}
	
	public String processBody(String folioId) throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.newDocument();
		
		Element reqInfoElement = doc.createElement( "ReqInfoFolio" );
		doc.appendChild( reqInfoElement );
		
		Element userElement = doc.createElement( "User" );
		reqInfoElement.appendChild( userElement );
		
		Element loginElement = doc.createElement( "Login" );
		loginElement.appendChild( doc.createTextNode( "rcgexternal" ) );
		userElement.appendChild(loginElement);
		
		Element passwordElement = doc.createElement( "Password" );
		passwordElement.appendChild( doc.createTextNode( "WeLoveFullSailings!" ) );
		userElement.appendChild(passwordElement);

				
		Element folioElement = doc.createElement( "Folio" );
		reqInfoElement.appendChild( folioElement );
		
		Element folioIdElement = doc.createElement( "FolioId" );
		folioIdElement.appendChild( doc.createTextNode( folioId ) );
		folioElement.appendChild(folioIdElement);
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		StringWriter writer = new StringWriter();

		transformer.transform( new DOMSource( doc ), new StreamResult( writer ) );
		
		String personXMLStringValue = writer.getBuffer().toString();
		
		
		
		return personXMLStringValue;
	
	}
	
	

}
