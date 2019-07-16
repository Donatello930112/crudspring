package com.example.crudspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	String hellow() {
		return "Hello World!(pinguino)";
	}
}
