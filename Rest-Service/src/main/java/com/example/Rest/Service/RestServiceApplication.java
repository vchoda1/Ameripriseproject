package com.example.Rest.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestServiceApplication {

	@RequestMapping("/hello_world")
	public String getHelloWorld(){
		return "Hello World";
	}

	@RequestMapping("/")
	public String index(){
		return "THis is home page";
	}
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
