package com.abhi.lc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.abhi.lc.DTO.EmailDTO;
import com.abhi.lc.DTO.UserInfoDTO;
import com.abhi.lc.service.MailSenderService;

@Controller
public class EmailController {
	
	@Autowired
	private MailSenderService mailSenderService;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO,Model model) {
		
		return "send-email-page";
		
	}
	
	@RequestMapping("/processEmail")
	public String processEamil(@SessionAttribute("userInfo")UserInfoDTO userInfo,@ModelAttribute("emailDTO") EmailDTO emailDTO,Model model) {
		mailSenderService.send(userInfo.getYourName(),emailDTO.getUserEmail(),"Friends");
		return "process-email-page";
		
	}

}
