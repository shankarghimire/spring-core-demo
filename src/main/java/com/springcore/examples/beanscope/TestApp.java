package com.springcore.examples.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/examples/beanscope/beanscope-config.xml");
		
		System.out.println("Context loaded...");
		
		Student std1 = applicationContext.getBean("std",Student.class);
//		std1.setStudentName("Shankar Ghimire");
//		std1.setCity("Brampton");
		System.out.println("std1 :" + std1.hashCode());
		
		Student std2 = applicationContext.getBean("std",Student.class);
		System.out.println("std2 :" + std2.hashCode());
	}

}
