package com.springcore.examples.di.constructor.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/examples/di/constructor/primitive/primitive-config.xml");
		System.out.println("===============================================");
		System.out.println("Constructor DI using 'constructor-arg' tag and 'value' tag");
		Person p1 = (Person) applicationContext.getBean("p1");
		System.out.println(p1);

		System.out.println("===============================================");
		System.out.println("Constructor DI using 'constructor-arg' tag and 'value' attribute");
		Person p2 = (Person) applicationContext.getBean("p2");
		System.out.println(p2);

		System.out.println("===============================================");
		System.out.println("Constructor DI using 'c' schema");
		Person p3 = (Person) applicationContext.getBean("p3");
		System.out.println(p3);

		// applicationContext.close();

	}

}
