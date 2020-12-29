package com.springcore.examples.di.setter.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/examples/di/setter/primitive/primitive-config.xml");
		System.out.println("===============================================");
		System.out.println("Setter DI using 'property' and 'value' tag");
		Student student1 = (Student) applicationContext.getBean("student1");
		System.out.println(student1);

		System.out.println("===============================================");
		System.out.println("Setter DI using 'property' and 'value' attribute");
		Student student2 = (Student) applicationContext.getBean("student2");
		System.out.println(student2);

		System.out.println("===============================================");
		System.out.println("Setter DI using 'p' schema");
		Student student3 = (Student) applicationContext.getBean("student3");
		System.out.println(student3);

		// applicationContext.close();

	}

}
