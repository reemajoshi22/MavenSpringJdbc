package com.example.maven.hibernate.MavenSpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	    	ApplicationContext context =
	    		new ClassPathXmlApplicationContext("Spring-Module.xml");

	        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
	        Customer customer = new Customer(4, "minu",28);
	        customerDAO.insert(customer);

	        Customer customer1 = customerDAO.findByCustomerId(4);
	        System.out.println(customer1);

	    }
}
