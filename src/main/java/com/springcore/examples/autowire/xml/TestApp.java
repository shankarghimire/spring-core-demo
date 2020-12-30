package com.springcore.examples.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/examples/autowire/xml/autowire-config.xml");
		System.out.println("===============================================");
		System.out.println("Autowiring using byName");
		
		Employee e1 = applicationContext.getBean("e1", Employee.class);
		System.out.println(e1);
	}

}
