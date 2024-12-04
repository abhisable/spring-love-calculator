package com.abhi.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.EmailDTO;

@Controller
public class EmailController {
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO,Model model) {
		
		return "send-email-page";
		
	}
	
	@RequestMapping("/processEmail")
	public String processEamil(@ModelAttribute("emailDTO") EmailDTO emailDTO,Model model) {
		
		return "process-email-page";
		
	}

}
