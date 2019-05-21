package com.example.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class CustomRESTRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		 restConfiguration().host("localhost").port(8092);
		
		
		
//	from("timer:hello?period={{timer.period}}")	 
//	from("direct:sourceRESTRoute")
//         .setHeader("id", simple("${random(1,3)}"))
//         .to("rest:get:kafka//camel/routeREST")
//         .log("${body}");
		
	}

}
