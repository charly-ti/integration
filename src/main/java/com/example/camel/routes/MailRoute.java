package com.example.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class MailRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
//		Camel Route for Mail services.	
		
		from("direct:mailRoute")
		.setHeader("subject", simple("Invitation Mail"))
		.setHeader("to", simple("{{mail.to}}"))
		.setHeader("value", simple("${body}"))
		.setHeader( Exchange.CONTENT_TYPE, simple("text/html"))
		.to("log:Mail Route Initiated?level=INFO")
//		.process(new FTLProcess())
		.to("freemarker:com/example/camel/freemarker/template.ftl")
		.to("smtps://smtp.gmail.com:465?username={{mail.username}}&password={{mail.password}}")
//		.to("smtp://smtp.office365.com:587?password=RCG@TI2019&username=Charly.Joseph@rcggs.com")
		.routeId("Mail")
		.setBody(simple("${in.header.value}"))
		.to("log:Mail Service Completed?level=INFO");
	
		
		
//		Camel Route for Mail services on exception.	
		
		from("direct:mailRouteOnException")
		.setHeader("subject", simple("Exception Mail"))
		.setHeader("to", simple("{{mail.to}}"))
		.setBody(simple("${body}"))
		.to("smtps://smtp.gmail.com:465?username={{mail.username}}&password={{mail.password}}");
		
	}

}
