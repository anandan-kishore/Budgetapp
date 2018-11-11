package com.kk.think.user.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.kk.think.user.domain.Account;

@Path("/management")
public class AccountManagement {
	
	@GET
	@Path("/test")
	@Produces("application/json")
	public Response test() {
		Account account = new Account();
		
		account.setId(101l);
		account.setName("kishore");
		account.setPassword("sarnitha");
		
		return Response.status(200).entity(account).build();
	}

}
