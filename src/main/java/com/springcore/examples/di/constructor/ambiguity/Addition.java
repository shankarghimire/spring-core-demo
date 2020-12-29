package com.springcore.examples.di.constructor.ambiguity;

public class Addition {
	private int a;
	private int b;
	
	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Addition(int a, int b) {
		System.out.println("Constructor : int , int");
		this.a = a;
		this.b = b;
	}
	
	public Addition(double a, double b) {
		System.out.println("Constructor : double , double");
		this.a = (int) a;
		this.b = (int) b;
	}
	
	public Addition(String a, String b) {
		System.out.println("Constructor : String , String");
		this.a =  Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	public void doSum() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("Sum is : " + (this.a + this.b));
	}
	
	
}
