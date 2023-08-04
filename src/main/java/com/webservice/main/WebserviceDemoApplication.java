package com.webservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceDemoApplication {

	public static void main(String[] args) {
		
		System.out.println("Webservice");
		SpringApplication.run(WebserviceDemoApplication.class, args);
	}

}
