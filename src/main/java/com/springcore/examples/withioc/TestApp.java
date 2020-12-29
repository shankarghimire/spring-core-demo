package com.springcore.examples.withioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/examples/withioc/sim-config.xml");
		System.out.println("Testing: context loaded...");
		
		//Using different sim
		Sim sim;
		sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}

}
