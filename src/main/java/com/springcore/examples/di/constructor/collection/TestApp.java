package com.springcore.examples.di.constructor.collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/examples/di/constructor/collection/collection-config.xml");
		System.out.println("===============================================");
		System.out.println("DI using Java-Collection-objects");
		Employee e1 = (Employee) applicationContext.getBean("emp1");
		System.out.println(e1);
		
		
		
		
		
		 //applicationContext.close();
		 
		 
		 
		
	}

}
