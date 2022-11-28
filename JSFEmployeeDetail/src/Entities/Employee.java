package Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Employee {

	private String Name;
	private String Surname;
	private String Username;
	private String Country;
	private String[] Hobbies;
	private String Password;
	private boolean isAdmin;
	private String Position;
	private int Age;
	private String Gender;
	public Map<String,Object> AllCountries =new LinkedHashMap<String,Object>();
	public Map<String,Object> AllHobbies =new LinkedHashMap<String,Object>();
	public void Save()
	{
		Employee employee=new Employee();
		employee.Age=this.Age;
		employee.Country=this.Country;
		employee.Gender=this.Gender;
		employee.Hobbies=this.Hobbies;
		employee.isAdmin=this.isAdmin;
		employee.Name=this.Name;
		employee.Password=this.Password;
		employee.Position=this.Position;
		employee.Surname=this.Surname;
		employee.Username=this.Username;
		EmployeeList.add(employee);
		
		
	}
	
	public List<Employee> EmployeeList=new ArrayList<>();
	
	public List<Employee> getEmployeeList() {
		return EmployeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		EmployeeList = employeeList;
	}
	public Map<String, Object> getAllCountries() {
		return AllCountries;
	}
	public Map<String, Object> getAllHobbies() {
		return AllHobbies;
	}
	public void setAllHobbies(Map<String, Object> allHobbies) {
		AllHobbies = allHobbies;
	}
	
	public String ConvertArryToString()
	{
		return Arrays.toString(Hobbies);
		
	}
	public void setAllCountries(Map<String, Object> allCountries) {
		AllCountries = allCountries;
	}
	{
		AllCountries.put("France", "france");
		AllCountries.put("England", "england");
		AllCountries.put("Russia", "russia");
		AllCountries.put("USA", "usa");
		AllCountries.put("Italy", "italy");
		AllHobbies.put("Swimming", "swimming");
		AllHobbies.put("Reading", "reading");
		AllHobbies.put("Tracking", "tracking");
	}
			
	
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
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String[] getHobbies() {
		return Hobbies;
	}
	public void setHobbies(String[] hobbies) {
		Hobbies = hobbies;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}

}
