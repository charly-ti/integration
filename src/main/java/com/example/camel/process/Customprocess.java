package com.example.camel.process;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import com.example.camel.model.User;

public class Customprocess implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Message message = exchange.getIn();
		User user = message.getBody(User.class);
		System.out.println("user recived"+user.getName());
		exchange.getOut(User.class);

	}
	

}
