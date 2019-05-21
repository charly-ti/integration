package com.example.camel.process;

import java.io.IOException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Exceptionprocess implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Exception exception = (Exception) exchange.getProperty(Exchange.EXCEPTION_CAUGHT);
		
		System.out.println("Exception occured"+exception.getMessage());
		
		throw new IOException("sorry device error");  

	}

}
