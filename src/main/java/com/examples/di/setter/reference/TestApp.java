package com.examples.di.setter.reference;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/examples/di/setter/reference/reference-config.xml");
		System.out.println("===============================================");
		System.out.println("DI using Reference-objects");
		
		//B b1 = (B) applicationContext.getBean("b1");
		A a1 = (A) applicationContext.getBean("a1");
		System.out.println("a1 : " + a1);
//		System.out.println("X = " + a1.getX());
//		System.out.println("objb : " + a1.getObjb().getY());
		
		System.out.println("===============================================");
		System.out.println("DI using 'p' schema in Reference-objects");
		
		A a2 = (A) applicationContext.getBean("a2");
		System.out.println("a2 : " + a2);
		
		
		
		
		 //applicationContext.close();
		 
		 
		 
		
	}

}
