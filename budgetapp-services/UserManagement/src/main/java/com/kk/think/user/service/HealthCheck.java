package com.kk.think.user.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/healthcheck")
public class HealthCheck {
	
	@GET
	@Path("/test")
	public Response healthCheck() {
		return Response.status(200).entity("Success").build();
	}

}
