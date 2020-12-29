package com.springcore.examples.di.constructor.reference;

public class Address {
	private int houseNumber;
	private String street;
	private String city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int houseNumber, String street, String city, String state) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", state=" + state
				+ "]";
	}
	

}
