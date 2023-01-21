package com.example.meta.meta_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.meta.meta_test"})
public class MetaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetaTestApplication.class, args);
	}

	
}
