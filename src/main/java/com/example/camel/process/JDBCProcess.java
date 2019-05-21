package com.example.camel.process;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.example.camel.model.User;

public class JDBCProcess implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

	}

	public Map<String, Object> getMap(String name) {
		Map<String, Object> map = new HashMap<String, Object>();
		User user = new User();
		map.put("id", user.getId());
		map.put("name", name);
		user.setName(name);
		return map;
	}

	public String processMap(Map<String, Object> testBody) {
		User user = new User();
		user.setId((Long) testBody.get("id"));
		user.setName((String) testBody.get("name"));
		String xmlContent = convertToXML(user);
		return xmlContent;
	}

	public String convertToXML(User user) {
		String xmlContent = null;
		try {
			// Create JAXB Context
			JAXBContext jaxbContext = JAXBContext.newInstance(User.class);

			// Create Marshaller
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// Required formatting??
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Print XML String to Console
			StringWriter sw = new StringWriter();

			// Write XML to StringWriter
			jaxbMarshaller.marshal(user, sw);

			// Verify XML Content
			xmlContent = sw.toString();

			System.out.println(xmlContent);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return xmlContent;
	}

}
