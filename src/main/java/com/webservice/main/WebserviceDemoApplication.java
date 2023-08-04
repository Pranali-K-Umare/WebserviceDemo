package com.webservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceDemoApplication {

	public static void main(String[] args) {
		
		System.out.println("Webservice");
		System.out.println("Web Service Demo");
		SpringApplication.run(WebserviceDemoApplication.class, args);
	}

}
