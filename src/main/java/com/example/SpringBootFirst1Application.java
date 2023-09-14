package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFirst1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext r = SpringApplication.run(SpringBootFirst1Application.class, args);
		System.out.println(r.getClass().getName());
	}

}
