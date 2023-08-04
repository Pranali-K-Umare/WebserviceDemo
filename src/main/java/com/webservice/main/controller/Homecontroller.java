package com.webservice.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	@RequestMapping (value="/getStudentData")
	public String prelogin()
	{
		return "Welcome";
	}

}
