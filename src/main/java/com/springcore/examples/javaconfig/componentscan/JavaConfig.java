package com.springcore.examples.javaconfig.componentscan;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean // getStudent will be the name of the bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
	
	@Bean //employee will be the name of the bean
	public Employee employee() {
		return new Employee();
	}
	
}
