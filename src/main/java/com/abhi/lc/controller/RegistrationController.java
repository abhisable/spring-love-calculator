package com.abhi.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String registration(@ModelAttribute("userRegInfo") UserRegistrationDTO regDTO) {
		regDTO.setUserName("demousername");
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processRegistration(@ModelAttribute("userRegInfo") UserRegistrationDTO regDTO) {
		
		return "registration-success";
	}
	
	

}
