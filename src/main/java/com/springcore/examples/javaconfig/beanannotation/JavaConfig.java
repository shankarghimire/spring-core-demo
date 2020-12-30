package com.springcore.examples.javaconfig.beanannotation;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean // ByDefault method-name 'getStudent' will be the name of the bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
	
	@Bean(name= {"employee","emp","tempEmployee"})
	public Employee getEmployee() {
		return new Employee();
	}
	
}
