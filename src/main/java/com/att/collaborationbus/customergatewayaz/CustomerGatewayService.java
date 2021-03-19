package com.att.collaborationbus.customergatewayaz;


import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface CustomerGatewayService {
	
	@GetMapping(value = "/hello")
	@Produces({ MediaType.APPLICATION_JSON })
	public String getQuickHello(@QueryParam("name") String name);

	@PostMapping("/postOnTopic")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({ MediaType.APPLICATION_JSON })
	public void postOnTopic(@RequestBody String request);

}