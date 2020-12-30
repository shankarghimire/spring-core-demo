package com.springcore.examples.javaconfig.beanannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;


public class Student {
	@Value("Shankar Ghimire")
	private String studentName;
	
	@Value("Brampton")
	private String city;

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
