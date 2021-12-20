package com.Ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ECommerceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
		
		System.out.println("Hello World..");
	}
	
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(ECommerceApplication.class);
	 * 
	 * }
	 */
}
