package com.chat.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	
	@GetMapping(value = "/test")
	public String test1() {
		return "mohamed saber";
	}

}
