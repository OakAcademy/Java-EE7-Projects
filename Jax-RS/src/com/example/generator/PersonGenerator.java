package com.example.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.database.Database;
import com.example.model.Person;

public class PersonGenerator {
	private static final Map<Integer, Person> persons = Database.getPersons();
	{
		persons.put(1, new Person(1, "Nadia", "Komonochi", "Athlethe", 17));
		persons.put(2, new Person(1, "Salif", "Keita", "Singer", 40));
		persons.put(3, new Person(1, "Michael", "Moore", "Politician", 40));
		persons.put(4, new Person(1, "Aamir", "Khan", "Actor", 50));
		persons.put(5, new Person(1, "John", "Cazale", "Actor", 41));
		persons.put(6, new Person(1, "Nelson", "Mandela", "Activist", 70));
		persons.put(7, new Person(1, "Monica", "Seles", "TennisPlayer", 54));

	}
	public PersonGenerator() {
		// TODO Auto-generated constructor stub
	}
	public List<Person> getPersons(){
		return new ArrayList<>(persons.values());
		
	}
	
	public Person getPerson(int Id)
	{
		return persons.get(Id);
		
	}
	public Person addPerson(Person person)
	{
		person.setPersonId(persons.size()+1);
		persons.put(person.getPersonId(), person);
		return person;
		
	}
	
	public Person updatePerson(int personId,Person person)
	{
		persons.put(person.getPersonId(), person);
		return person;
		
	}
	public Person removePerson(int Id){
		
		return persons.remove(Id);
	}
	
	
	
	
	
	
 }
