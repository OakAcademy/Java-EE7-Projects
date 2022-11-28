package com.sample.general;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jersey.spi.dispatch.RequestDispatcher;

/**
 * Servlet implementation class AddPerson
 */
@WebServlet("/AddPerson")
public class AddPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 		
		javax.servlet.RequestDispatcher view = request.getRequestDispatcher("AddPerson.jsp");
		view.forward(request, response);
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if (request.getParameter("redirect")!=null){
			response.sendRedirect("FirstServlet");
		} else {
			String personName = request.getParameter("name");
			
			String surname = request.getParameter("surname");
			
			String age = request.getParameter("age");
			
			String job = request.getParameter("job");
			
			List<Employee> list = (List<Employee>)getServletContext().getAttribute("employees");
			
			Employee emp = new Employee();
			emp.setName(personName);
			emp.setSurname(surname);
			emp.setJob(job);
			emp.setAge(age);
			
			list.add(emp);
			
			System.out.println("--------------------------------");
			for(Employee e:list){
				System.out.println("Name is "+e.getName());
				System.out.println("Surname is "+e.getSurname());
				System.out.println("Age is "+e.getAge());
				System.out.println("Job is "+e.getJob());
				
			}
			
			System.out.println("--------------------------------");
			
			if (personName.trim().length() == 0 || surname.trim().length() == 0 || age.trim().length() == 0 || job.trim().length() == 0) {
				
				request.setAttribute("errors", false);
				
				if (personName.trim().length() == 0) {
					request.setAttribute("errors", true);
					request.setAttribute("error", "Please fill the name field");				
				}
				
				request.setAttribute("errorsSurname", false);
				if (surname.trim().length() == 0) {
					request.setAttribute("errorsSurname", true);
					request.setAttribute("errorSurname", "Please fill the surname field");				
				}

				request.setAttribute("errorsAge", false);
				if (age.trim().length() == 0) {
					request.setAttribute("errorsAge", true);
					request.setAttribute("errorAge", "Please fill the age field");				
				}

				request.setAttribute("errorsJob", false);
				if (job.trim().length() == 0) {
					request.setAttribute("errorsJob", true);
					request.setAttribute("errorJob", "Please fill the job field");				
				}
			
				
			} 
			doGet(request, response);
		}
		

		
	}

}
