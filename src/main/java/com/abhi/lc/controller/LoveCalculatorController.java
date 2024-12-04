package com.abhi.lc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.UserInfoDTO;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class LoveCalculatorController {

	@RequestMapping("/")
	public String getHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO,HttpSession session) {
	    Object userNameObj=session.getAttribute("userName");
	    if(userNameObj!=null)
	    	userInfoDTO.setYourName((String)userNameObj);
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String processHomepage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,BindingResult result,HttpSession session) {
		if(result.hasErrors()) {
			return "home-page";
		}
		session.setAttribute("userName", userInfoDTO.getYourName());
		return "result-page";
	}

}
