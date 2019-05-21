//package com.example.camel.routes;
//
//import org.apache.camel.builder.RouteBuilder;
//import org.springframework.stereotype.Component;
//@Component
//public class ActivemqRoute extends RouteBuilder{
//
//	@Override
//	public void configure() throws Exception {
//		from("direct:activMQRoute")
//		.setHeader("Message ID", simple("Apache camel route"))
//	    .to("activemq:queue:testQueue");
//		
//		
//	}
//
//}
