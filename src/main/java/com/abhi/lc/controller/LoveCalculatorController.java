package com.abhi.lc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abhi.lc.DTO.UserInfoDTO;
import com.abhi.lc.service.LCAppCalculatorService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("userInfo")
public class LoveCalculatorController {

	@Autowired
	LCAppCalculatorService calc;
	
	@RequestMapping("/")
	public String getHomePage(Model model) {
		UserInfoDTO userInfoDTO=new UserInfoDTO();
		
//	    Object userNameObj=session.getAttribute("userName");
//	    if(userNameObj!=null)
//	    	userInfoDTO.setYourName((String)userNameObj);
//	    
	    model.addAttribute("userInfo", userInfoDTO);
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String processHomepage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,BindingResult result,HttpSession session,Model model) {
		if(result.hasErrors()) {
			return "home-page";
		}
		session.setAttribute("userName", userInfoDTO.getYourName());
		model.addAttribute("result", calc.calculateLove(userInfoDTO.getYourName(), userInfoDTO.getCrushName()));
		return "result-page";
	}

}
