package com.abhi.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyTestController {

	@RequestMapping("/test")
	public String hello() {
		return "Hello-World";
	}
}
