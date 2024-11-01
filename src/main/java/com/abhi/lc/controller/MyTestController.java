package com.abhi.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyTestController {

	@RequestMapping("/test")
	public String hello() {
		return "Hello-World";
	}
}
