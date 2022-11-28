package com.example.database;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.example.model.Person;

public class Database {
private static final Map<Integer,Person> persons=new ConcurrentHashMap();
public static Map<Integer,Person> getPersons(){
	return persons;
}
}
