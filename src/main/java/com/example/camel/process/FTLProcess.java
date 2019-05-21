package com.example.camel.process;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.example.camel.model.ResInfoFolio;

public class FTLProcess implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		ResInfoFolio resInfoFolio = exchange.getIn().getBody(ResInfoFolio.class);
        exchange.getIn().setHeader("folioId", resInfoFolio.getFolioList().getFolio().getFolioId());
         exchange.getIn().setHeader("sureName", resInfoFolio.getFolioList().getFolio().getSurname());
         exchange.getIn().setHeader("foreName", resInfoFolio.getFolioList().getFolio().getForename());
         exchange.getIn().setHeader("middleName", resInfoFolio.getFolioList().getFolio().getMidname());
         exchange.getIn().setHeader("greeting", resInfoFolio.getFolioList().getFolio().getGreeting());
         exchange.getIn().setHeader("email", resInfoFolio.getFolioList().getFolio().getEmail1());
         exchange.getIn().setHeader("dob", resInfoFolio.getFolioList().getFolio().getBirthDate());
         exchange.getIn().setHeader("gender", resInfoFolio.getFolioList().getFolio().getGender());
         exchange.getIn().setHeader("phone", resInfoFolio.getFolioList().getFolio().getPhone1());
         exchange.getIn().setHeader("postal", resInfoFolio.getFolioList().getFolio().getPostalCode());
         exchange.getIn().setHeader("country", resInfoFolio.getFolioList().getFolio().getCountry());
         exchange.getIn().setHeader("lang", resInfoFolio.getFolioList().getFolio().getLanguage());
         exchange.getIn().setHeader("access", resInfoFolio.getFolioList().getFolio().getAccessLevel());
         exchange.getIn().setHeader("type", resInfoFolio.getFolioList().getFolio().getType());
         exchange.getIn().setHeader("flag", resInfoFolio.getFolioList().getFolio().getFlagCode());
         exchange.getIn().setHeader("modified", resInfoFolio.getFolioList().getFolio().getModifyDate());
         exchange.getIn().setHeader("privacy1", resInfoFolio.getFolioList().getFolio().getPrivacy1());
         exchange.getIn().setHeader("privacy2", resInfoFolio.getFolioList().getFolio().getPrivacy2());
         exchange.getIn().setHeader("privacy3", resInfoFolio.getFolioList().getFolio().getPrivacy3());
         exchange.getIn().setHeader("privacy4", resInfoFolio.getFolioList().getFolio().getPrivacy4());
         exchange.getIn().setHeader("privacy5", resInfoFolio.getFolioList().getFolio().getPrivacy5());
         exchange.getIn().setHeader("privacy6", resInfoFolio.getFolioList().getFolio().getPrivacy6()); 
         exchange.getIn().setHeader("privacy7", resInfoFolio.getFolioList().getFolio().getPrivacy7());
         exchange.getIn().setHeader("privacy8", resInfoFolio.getFolioList().getFolio().getPrivacy8());
         


	}
}
