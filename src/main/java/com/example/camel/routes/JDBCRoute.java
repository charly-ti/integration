package com.example.camel.routes;

import javax.sql.DataSource;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JDBCRoute extends RouteBuilder {
	@Autowired
	DataSource dataSource;
	
	@Override
	public void configure() throws Exception {
		
		
//		Camel Routes for JDBC operations.
		
//		 from("direct:jdbcRouteFetch")
//		 .setBody(constant("select * from user")) 
//		 .to("jdbc:dataSource")
//		 .to("sql:select * from user where id =1?dataSource=#dataSource")
//		 .split(body()) 
//		 .process(new RESCOCustomProcess());
//		 .to("direct:dataFromDB");
		  
		  
		 
		 
		 
//		 from("direct:jdbcRouteAdd")
//		 .to("log:Received new user?level=INFO")
//		 .bean(JDBCProcess.class,"getMap(${body})")
//		 .to("sql:insert into user(id,name) values(:#id, :#name)?dataSource=#dataSource")
//		 .bean(JDBCProcess.class,"processMap(${body})")
//		 .to("log:New user has been added?level=INFO");		 
		 
	}

}
