//package com.example.camel.routes;
//
//import org.apache.camel.Exchange;
//import org.apache.camel.builder.RouteBuilder;
//import org.springframework.stereotype.Component;
//
//import com.example.camel.process.FTLProcess;
//import com.example.camel.process.RESCOCustomProcess;
//
//@Component
//public class RESCORoute extends RouteBuilder {
//
//	@Override
//	public void configure() throws Exception {
//
////  	Route For RESCO REST API
//	from("direct:camelRESCORoute")
//		.to("log:REST API for RESCO Started?level=INFO")
//		.log("${body}")
//		.bean(RESCOCustomProcess.class,"processBody(${body})")
//		.log("${body}")
//		.to("https://testresapi.ritz-carltonyachtcollection.com/rescoweb/ResWebConvert/InterfaceResco.aspx")
//		.to("log:REST API for RESCO is Completed?level=INFO")	
////		Adding the Data to ActiveMQ and  Backup data in a file
//		.to("log:Moving the data to ActiveMq?level=INFO")
//		.to("direct:activMQRoute");
//	
//	from("activemq:queue:testQueue")
//		.to("log:Moving the data to Backup file?level=INFO")
//	    .wireTap("file:/home/charlie/Charly?fileName=file1.xml&fileExist=Append")
////		Transforming the XML to Entity	 
//		.to("log:Data Transformation Started?level=INFO")
//		.process(new RESCOCustomProcess())
//		.to("log:Data Transformation Completed?level=INFO")
//		.to("direct:saveInDB");
//
//// 		 Saving the Value in Database
//	from("direct:saveInDB")
//		.to("log:JDBC Route Started?level=INFO")
//		.bean(RESCOCustomProcess.class,"processResponse(${body})")
//		.to("log:JDBC Route Completed?level=INFO")
//		.to("direct:mailRESCORoute");
//	
//	
////  	Mailing  the Value in to the Guest using Freemarker Template	
//	from("direct:mailRESCORoute")
//	    .to("log:Mail Route Started?level=INFO")
//		.setHeader("subject", simple("Guest Registration Details"))
//		.setHeader("to", simple("{{mail.to}}"))
//		.setHeader("value", simple("${body}"))
//		.setHeader( Exchange.CONTENT_TYPE, simple("text/html"))
//		.process(new FTLProcess())
//		.to("freemarker:com/example/camel/freemarker/test.ftl")
//		.to("smtps://smtp.gmail.com:465?username={{mail.username}}&password={{mail.password}}")
//		.to("log:Mail Route Completed?level=INFO");
//	
//	}
//
//}
