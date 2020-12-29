package com.springcore.examples.di.setter.reference;

public class A {
	private int x;
	private B objb;
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObjb() {
		return objb;
	}
	public void setObjb(B objb) {
		this.objb = objb;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", objb=" + objb + "]";
	}
	
}
