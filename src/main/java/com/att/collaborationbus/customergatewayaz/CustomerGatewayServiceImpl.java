package com.att.collaborationbus.customergatewayaz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerGatewayServiceImpl implements CustomerGatewayService{

	private static Logger log = LoggerFactory.getLogger(CustomerGatewayServiceImpl.class);

	
	public String getQuickHello(String name) {

		log.debug("In CustomerGatewayServiceImpl :: getQuickHello");
		if (name == null || name.isEmpty()) {
			name = "world";
		}
		String message = "Hello " + name + "!";
		return message;
	}

	public void postOnTopic(String request) {
		log.debug("In CustomerGatewayServiceImpl :: postOnTopic :: {}", request);
	}
}