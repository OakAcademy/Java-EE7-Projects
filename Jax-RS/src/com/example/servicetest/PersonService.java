package com.example.servicetest;

import java.net.URI;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.example.generator.PersonGenerator;
import com.example.model.Person;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Path("/firstservice")
public class PersonService {

	PersonGenerator personGenerator;
	public PersonService() {
		if(personGenerator==null)
			personGenerator=new PersonGenerator();
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPersons()
	{
		return Response.ok(personGenerator.getPersons()).build();
	}
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(@PathParam("id") int id)
	{
		return personGenerator.getPerson(id);
		
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@JsonDeserialize(builder=Person.class)
	public Response addPerson(Person person, @Context UriInfo uriInfo)
	{
		Person newPerson=personGenerator.addPerson(person);
		String newId=String.valueOf(newPerson.getPersonId());
		URI uri=uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.ok("Person Added").status(Response.Status.CREATED).build();
	}
	
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@JsonDeserialize(builder=Person.class)
	public Response updatePerson(Person person, @Context UriInfo uriInfo)
	{
		Person newPerson=personGenerator.updatePerson(person.getPersonId(), person);
		return Response.ok("Person Updated").status(Response.Status.NO_CONTENT).build();
		
		
	}
	
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletePerson(@PathParam("id") int id)
	{
		personGenerator.removePerson(id);
		return Response.ok("Person Deleted").status(Response.Status.OK).build();
		
	}
	
	
	
	
	
	
	
	
	
	
}
