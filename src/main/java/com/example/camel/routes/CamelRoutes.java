package com.example.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import com.example.camel.process.Exceptionprocess;

@Component
public class CamelRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {

//		Calling from One Camel Route to another Route and deals with exception.		
	onException(Exception.class)
		.process(new Exceptionprocess())
		.handled(true)
	    .setBody(constant("error"))
	    .to("direct:logRoute");	
	from("direct:testMultiple")
	    .to("direct:sourceRESTRoute")
		.to("direct:jdbcRouteAdd")	
		.to("direct:mailRoute")
		.to("direct:sinkRESTRoute");
		
			
//		Camel Route to Call source REST API.
		
	from("direct:sourceRESTRoute")
         .setHeader(Exchange.HTTP_METHOD, constant("POST"))
         .setBody (simple ("${body}"))
         .setHeader("request", simple("${body}"))
         .to("http:localhost:8092/kafka/camel")
         .log("${body}")
         .setBody(simple("${in.header.request}"))
         .routeId("SourceREST")
         .to("log:Source REST Invoked?level=INFO");

//		Camel Route to Call sink REST API.
			
	from("direct:sinkRESTRoute")
	      .setHeader(Exchange.HTTP_METHOD, constant("POST"))
	      .setBody (simple ("${body}"))
	      .to("http:localhost:8092/kafka/camel")
	      .setBody (simple ("Sink REST Invoked and new user is created :${body}"))
	      .routeId("SinkREST")
	      .log("${body}")
	      .to("log:Sink REST Invoked?level=INFO");
		

	}

}
