package com.springcore.examples.beanscope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component// By default, class-name with camel case will be the bean name
@Component("std")
//@Scope("prototype")//By default, 'singleton' will be the bean scope, and 
//using 'prototype' we can change into 
public class Student {
	@Value("Shankar Ghimire")
	private String studentName;
	
	@Value("Brampton")
	private String city;
	@Value("#{temp}")
	private List<String> addresses;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", addresses=" + addresses + "]";
	}
	
}
