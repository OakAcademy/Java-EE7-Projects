package com.example.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
@JsonDeserialize(builder=Person.Builder.class)
public class Person {
	private int personId;
	private String name;
	private String surname;
	private String job;
	private int age;

	public Person(int personId,String name,String surname,String job,int age) {
		super();
		this.personId=personId;
		this.name=name;
		this.surname=surname;
		this.job=job;
		this.age=age;
		

		// TODO Auto-generated constructor stub
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@JsonPOJOBuilder(withPrefix="",buildMethodName="create")
	public static class Builder{
		
		private int personId;
		private String name;
		private String surname;
		private String job;
		private int age;
		
		public Builder personId(int personId)
		{
			this.personId=personId;
			return this;
		}
		public Builder name(String name)
		{
			this.name=name;
			return this;
		}
		public Builder surname(String surname)
		{
			this.surname=surname;
			return this;
		}
		public Builder job(String job)
		{
			this.job=job;
			return this;
		}
		public Builder age(int age)
		{
			this.age=age;
			return this;
		}
		
		public Person build()
		{
			return new Person(personId, name, surname, job, age);
		}
		public Person create()
		{
			return new Person(personId, name, surname, job, age);
		}
	}
	
	
	
	
	
	
	
	
	
}
