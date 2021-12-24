package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootintegrjenkdockerApplication {

	@GetMapping("/admin")
	public String show() {
		System.out.println("Hello");
		return "Jenkins";
	}
	public static void main(String[] args) {
		SpringApplication.run(BootintegrjenkdockerApplication.class, args);
	}

}
