package com.sample.general;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class NewContextListener
 *
 */
@WebListener
public class NewContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public NewContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    	ServletContext ctx = arg0.getServletContext();
    	List<Employee> list = (List<Employee>)ctx.getAttribute("employees");
    	if (list==null) {
    		list = new ArrayList<Employee>();
    		ctx.setAttribute("employees", list);
    	}
    	
    }
	
}
