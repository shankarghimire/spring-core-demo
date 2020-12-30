package com.springcore.examples.javaconfig.componentannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.examples.javaconfig.componentscan")
public class JavaConfig {

}
