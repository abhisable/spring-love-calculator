package com.abhi.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.UserInfoDTO;

@Controller
public class LoveCalculatorController {

	@RequestMapping("/")
	public String getHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String processHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "result-page";
	}

}
