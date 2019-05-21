package com.example.camel.controller;

import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.camel.model.ResInfoFolio;

@RestController
@RequestMapping(value = "/custom")
public class customController {

	@Autowired
	ProducerTemplate producerTemplate;
	@Autowired
	ConsumerTemplate ConsumerTemplate;

	@PostMapping(value = "kafka/camelRoute")
	public String camelRouteMethodUser(@RequestBody String userName) {
		System.out.println("REST Call in Progress for the User: " + userName);
		return userName;

	}

	@PostMapping(value = "/callRouteToRESCO")
	public ResInfoFolio camelRESCORoute(@RequestBody ResInfoFolio resInfoFolio) {
		System.out.println("REST Call in Progress for the User: " + resInfoFolio.getFolioList().getFolio().getSurname());
		return  resInfoFolio;

	}

	@PostMapping(value = "/callRESCORoute")
	public String startCamelRoute(@RequestParam String folioId) {
		producerTemplate.sendBody("direct:camelRESCORoute",folioId);
		return "Completed the RESCO REST API Call for fetching Guest Registration details.";
	}
	
//	@PostMapping(value = "/callTwilioRoute")
//	public void startCamelRoute(@RequestParam String folioId) {
//		producerTemplate.sendBody("direct:twilioRoute",folioId);
//	}

}
