package Entities;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;;

@ManagedBean(name="Author", eager=true)
@SessionScoped
public class Author {
private String Name;
private String Surname;
private int Age;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
}
