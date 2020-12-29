package com.examples.withioc;

public class Fido implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Fido Sim...");

	}

	@Override
	public void data() {
		System.out.println("Data browsing from Fido Sim...");

	}

}
