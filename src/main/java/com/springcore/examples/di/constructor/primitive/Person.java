package com.springcore.examples.di.constructor.primitive;

public class Person {
	private int personId;
	private String name;
	private String address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Person(int personId, String name, String address) {
		super();
		this.personId = personId;
		this.name = name;
		this.address = address;
	}


	public int getPersonId() {
		return personId;
	}
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", address=" + address + "]";
	}

}
