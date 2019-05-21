package com.example.camel.controller;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelController {

	@Autowired
	ProducerTemplate producerTemplate;
	@Autowired
	ConsumerTemplate ConsumerTemplate;
	@Autowired
	CamelContext context;

	@PostMapping(value = "/callRoute")
	public String sendToCamelRoute(@RequestParam("userName") String userName) {
		producerTemplate.sendBody("direct:testMultiple", userName);
		return userName;

	}

	@GetMapping(value = "/callRouteToFetch")
	public void sendToCamelRouteJDBC() {
		producerTemplate.sendBody("direct:jdbcRouteFetch", "To fetch value from DB");

	}
	
	@GetMapping(value = "/callRouteToKafka")
	public void sendToCamelKafka() {
		producerTemplate.sendBody("direct:customKafka", "To fetch value from DB");

	}

	@RequestMapping(value = "/callJDBCRoute")
	public void startCamelJDBCRoute(@RequestParam("userName") String userName) {
		producerTemplate.sendBody("direct:jdbcRouteAdd", userName);

	}

	@RequestMapping(value = "/callMailRoute")
	public void startCamelMailRoute() {
		producerTemplate.sendBody("direct:mailRoute", "Calling for mail Route");
	}

	@GetMapping(value = "/camel/activeMQ")
	public String camelActiveMQRoute() {
		producerTemplate.sendBody("direct:activMQRoute", "Calling for activeMQ Route");
		return "Recived Camel REST request";

	}

	@PostMapping(value = "/callValidateRoute")
	public String valiadteCamelRoute(@RequestParam("userName") String userName) {
		producerTemplate.sendBody("direct:validateRoute", userName);
		return userName;

	}

	@PostMapping(value = "/callCustomRoute")
	public String sendToCustomCamelRoute(@RequestParam("userName") String userName) {
		System.out.println("Custom Camel Route Invoked");
		producerTemplate.sendBody("direct:customeRoute", userName);
		return "User has been Successfully created with name: " + userName + " & Completed the Route Processes.";

	}

}
