package com.abhi.lc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.UserInfoDTO;

import jakarta.validation.Valid;

@Controller
public class LoveCalculatorController {

	@RequestMapping("/")
	public String getHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String processHomepage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,BindingResult result) {
		if(result.hasErrors()) {
			return "home-page";
		}
		return "result-page";
	}

}
