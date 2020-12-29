package com.springcore.examples.withioc;

public class Bell implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Bell Sim...");

	}

	@Override
	public void data() {
		System.out.println("Data browsing from Bell Sim...");

	}

}
