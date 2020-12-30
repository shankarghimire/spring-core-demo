package com.springcore.examples.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springcore/examples/spel/spel-config.xml");
		
		System.out.println("Context loaded...");
		
		Demo d1 = applicationContext.getBean("demo",Demo.class);
		System.out.println(d1);
	}

}
