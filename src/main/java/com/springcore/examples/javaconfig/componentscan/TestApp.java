package com.springcore.examples.javaconfig.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		System.out.println("Context loaded...");
		
		Student std1 = applicationContext.getBean("getStudent",Student.class);
		System.out.println(std1);
		
		Employee emp1 = applicationContext.getBean("employee", Employee.class);
		System.out.println(emp1);
	}

}
