package com.springcore.examples.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/examples/stereotype/stereotype-config.xml");
		
		System.out.println("Context loaded...");
		
		Student std1 = applicationContext.getBean("std",Student.class);
//		std1.setStudentName("Shankar Ghimire");
//		std1.setCity("Brampton");
		System.out.println(std1);
	}

}
