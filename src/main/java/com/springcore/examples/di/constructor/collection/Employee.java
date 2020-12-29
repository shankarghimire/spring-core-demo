package com.springcore.examples.di.constructor.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class Employee {
	private String name;
	private List<String>phones;
	private Set<String> address;
	private Map<String,String>courses;
	private Properties property;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> courses,
			Properties property) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
		this.property = property;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", courses=" + courses
				+ ", property=" + property + "]";
	}



	
}
