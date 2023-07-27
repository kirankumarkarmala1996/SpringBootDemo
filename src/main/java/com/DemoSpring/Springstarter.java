package com.DemoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan	
@EnableAutoConfiguration //using this we can create the dispatch servlet
public class Springstarter {

	public static void main(String[] args) {
		SpringApplication spring = new SpringApplication(Springstarter.class);
		ConfigurableApplicationContext context=spring.run();
		College clgObj=context.getBean(College.class);
		System.out.println("college object created by spring bean"+clgObj);
		clgObj.printCollegeName();
	}
//	@Bean
	public College clgobj() {
		 return new College();
	}
}
