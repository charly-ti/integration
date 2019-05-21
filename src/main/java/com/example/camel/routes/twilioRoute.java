package com.example.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.twilio.TwilioComponent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;
@Component
public class twilioRoute extends RouteBuilder {
	
    // Twilio

    @Value("${twilio.username}")
    private String twilioUsername;

    @Value("${twilio.password}")
    private String twilioPassword;

    @Value("${twilio.number.from}")
    private String twilioNumberFrom;

    @Value("${twilio.number.to}")
    private String twilioNumberTo;
    

	@Override
	public void configure() throws Exception {
		
		
		 Twilio.init("ACe38d3ff4cf54acc20b266698445774df", "547452d288919b044dd6b452b536ce21");
		
		setupTwilio(getContext().getComponent("twilio", TwilioComponent.class));
		
		 from("direct:twilioRoute")
		 .setHeader("CamelTwilioTo", constant(new PhoneNumber(twilioNumberTo)))
         .setHeader("CamelTwilioFrom", constant(new PhoneNumber(twilioNumberFrom)))
         .setHeader("CamelTwilioBody", simple("${body} from Camel!"))
         .to("twilio://message/create");
		
	}
	
	 private void setupTwilio(TwilioComponent twilio) {
	        twilio.getConfiguration().setUsername(twilioUsername);
	        twilio.getConfiguration().setPassword(twilioPassword);
	    }

}
