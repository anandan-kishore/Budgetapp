package com.kk.think.user.conf;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.kk.think.user.service.AccountManagement;
import com.kk.think.user.service.HealthCheck;

@Component
public class JerseyConfig extends ResourceConfig 
{
	public JerseyConfig() 
	{
		register(HealthCheck.class);
		register(AccountManagement.class);
	}
}