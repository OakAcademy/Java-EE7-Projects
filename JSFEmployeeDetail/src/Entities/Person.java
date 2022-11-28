package Entities;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Person {

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void SetList()
	{
		list=employee.EmployeeList;
		
	}
	@ManagedProperty(value="#{Employee}")
	private Employee employee;
	private List<Employee> list;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public List<Employee> getList() {
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}
	
}
