package com.example.camel.routes;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import com.example.camel.process.JDBCProcess;
@Component
public class CustomRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:customeRoute")
	    .to("direct:RESTRoute")
//	    .to("direct:mailRoute")
	    .to("direct:jdbcRouteAdd");
		
//		Camel Route to Call  REST API.
		
		from("direct:RESTRoute")
		     .to("log:REST Call Invoked?level=INFO")
	         .setHeader(Exchange.HTTP_METHOD, constant("POST"))
	         .setHeader("request", simple("${body}"))
	         .to("http:localhost:8080/custom/callRouteToRESCO")
	         .setBody(simple("${in.header.request}"))
	         .to("log:REST Call Completed?level=INFO");
				
//		Camel Routes for JDBC operation.
		
		from("direct:jdbcRouteAdd")
		 .to("log:JDBC Route Initiated?level=INFO")
		 .bean(JDBCProcess.class,"getMap(${body})")
		 .to("sql:insert into user(id,name) values(:#id, :#name)?dataSource=#dataSource")
		 .to("log:JDBC Route Completed?level=INFO")
		 .to("log:XML Transformation Initiated?level=INFO")
		 .bean(JDBCProcess.class,"processMap(${body})")
		 .to("log:XML Transformation Completed?level=INFO")
		 .to("file:/home/charlie/Charly?fileName=file1.xml&fileExist=Append")
		 .to("log:Moved Data to New File?level=INFO")
		 .to("direct:XMLtoJSONtransform")
		 .setHeader("CamelFileName", constant("file1.xml"))
//		 .to("sftp://charly@localhost:22/upload?knownHostsFile=/home/charlie/Documents/sftp_known_host&password=charly")
		 .to("log:Moved File to SFTP Server?level=INFO");
		
//	from("file:/home/charlie/Charly?fileName=file1.xml&fileExist=Append")
//	.to("file:/home/charlie/Documents/Server?");
	}
	
	
	
	
	

}
