package com.example.servicetest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/firstservice")
public class Employee {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getName(){
		return "Charles Semih DICKENS";
	}

}
