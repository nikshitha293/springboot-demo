package com.javabytest.Springdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class WelcomeController {

	 @GetMapping("/api/message")
	    public String getMessage() {
	        return "Hello from Spring Boot!---";
	    }
}


