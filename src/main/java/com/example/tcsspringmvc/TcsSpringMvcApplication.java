package com.example.tcsspringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class TcsSpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsSpringMvcApplication.class, args);
	}

}
