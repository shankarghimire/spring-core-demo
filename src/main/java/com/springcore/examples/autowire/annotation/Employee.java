package com.springcore.examples.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("temp2")//if there are multiple beans of that Class
	private Address address;

	public Employee() {

	}
	
	//@Autowired
	public Employee(Address address) {
		System.out.println("Using Constructor...");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Using setter method...");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
