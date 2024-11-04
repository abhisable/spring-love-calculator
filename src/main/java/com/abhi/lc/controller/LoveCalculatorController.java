package com.abhi.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.UserInfoDTO;

@Controller
public class LoveCalculatorController {

	@RequestMapping("/")
	public String getHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String processHomepage(UserInfoDTO userInfoDTO, Model model) {
		System.out.println(userInfoDTO.getYourName()+" "+userInfoDTO.getCrushName());
		model.addAttribute("userInfo", userInfoDTO);
		return "result-page";
	}

}
