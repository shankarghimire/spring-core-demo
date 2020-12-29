package com.springcore.examples.withoutioc;

public class TestApp {

	public static void main(String[] args) {
		Sim sim;
		
		//Using Fido sim
//		sim = new Fido();
//		sim.calling();
//		sim.data();
		
		//Using Rogers sim
//		sim = new Rogers();
//		sim.calling();
//		sim.data();
		
		// Using Rogers sim
		sim = new Bell();
		sim.calling();
		sim.data();
	}

}
