package com.abhi.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.EmailDTO;

@Controller
public class EmailController {
	
	@RequestMapping("/sendEmail/{userName}")
	public String sendEmail(@PathVariable("userName") String userName,@ModelAttribute("emailDTO") EmailDTO emailDTO,Model model) {
		model.addAttribute("userName", userName);
		return "send-email-page";
		
	}
	
	@RequestMapping("/processEmail/{userName}")
	public String processEamil(@PathVariable("userName") String userName,@ModelAttribute("emailDTO") EmailDTO emailDTO,Model model) {
		model.addAttribute("userName", userName);
		return "process-email-page";
		
	}

}
