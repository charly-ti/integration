package com.example.camel.routes;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.mongodb.MongoClient;

@Configuration
public class Configurations {

	
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver"); 
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setUrl("jdbc:mysql://localhost:3306/Integration?useSSL=false");
        return ds;
		
		
	}
	
//	@Bean
//	public MongoClient myDb(){
//		MongoClient mc =new MongoClient("localhost",27017);
//		return mc;
//		
//	}
}
