package com.springcore.examples.javaconfig.componentscan;

import org.springframework.beans.factory.annotation.Value;


public class Employee {
	@Value("101")
	private int id;
	
	@Value("Shankar")
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
