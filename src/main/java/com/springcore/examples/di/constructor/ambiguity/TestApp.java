package com.springcore.examples.di.constructor.ambiguity;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/examples/di/constructor/ambiguity/ambiguity-config.xml");
		System.out.println("===============================================");
		System.out.println("DI using Java-Collection-objects");
		Addition a1 = (Addition) applicationContext.getBean("a1");
		a1.doSum();
		
		Addition a2 = (Addition) applicationContext.getBean("a2");
		a2.doSum();
		
		Addition a3 = (Addition) applicationContext.getBean("a3");
		a3.doSum();
		
		
		
		
		 //applicationContext.close();
		 
		 
		 
		
	}

}
