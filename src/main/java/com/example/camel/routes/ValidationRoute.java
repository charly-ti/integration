package com.example.camel.routes;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ValidationRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		onException(Exception.class)
		.handled(true)
		.process(new Processor() {
          @Override
          public void process(Exchange exchange) throws Exception {
              final Throwable ex = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Throwable.class);
              exchange.getIn().setBody(ex.getMessage());
          }
      })
	    .to("direct:logRoute");
//		.process(new Exceptionprocess());
		 from("direct:validateRoute")
//		.validate(body(String.class).regex("^\\w{10}\\,\\d{2}\\,\\w{24}$"))
        .setHeader(Exchange.HTTP_METHOD, constant("POST"))
        .to("http:localhost:8092/kafka/camel")
        .routeId("Validate")
        .log("${body}");
		
		
//		from("direct:validateRoute")
//		.doTry()
//		.process(new Exceptionprocess())
//		.doCatch(Exception.class)
//		.setBody(simple(""))
//		.to("direct:mailRouteOnException")
//		 .process(new Processor() {
//             @Override
//             public void process(Exchange exchange) throws Exception {
//                 final Throwable ex = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Throwable.class);
//                 exchange.getIn().setBody(ex.getMessage());
//             }
//         })
//		.doFinally()
//		.log("log:GeneralError?level=ERROR");
		 
		 
		 from("direct:logRoute")
		 .log("${body}")
		 .to("log:Exception occured?level=ERROR");
		
	}

}
