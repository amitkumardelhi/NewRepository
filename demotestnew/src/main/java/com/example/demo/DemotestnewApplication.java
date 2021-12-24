package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemotestnewApplication {
	
	@RequestMapping("/admin")
	public String hello() {
		System.out.println("welcome");
		return "<h1>welome back</h1>" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemotestnewApplication.class, args);
	}

}
