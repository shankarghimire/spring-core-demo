package com.springcore.examples.withinterface.noioc;

public class Rogers implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Rogers sim...");

	}

	@Override
	public void data() {
		System.out.println("Data browsing from Rogers sim...");

	}

}
