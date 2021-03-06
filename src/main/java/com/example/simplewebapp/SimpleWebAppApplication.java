package com.example.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SimpleWebAppApplication {

	@GetMapping
	public String hello(){
		return "HELLO WORLD!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAppApplication.class, args);
	}

}
