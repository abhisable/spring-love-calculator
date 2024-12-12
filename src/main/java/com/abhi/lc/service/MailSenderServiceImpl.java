package com.abhi.lc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderServiceImpl implements MailSenderService{

	@Autowired
	JavaMailSender mailSender;
	
	@Override
	public void send(String userName, String userEmail, String Result) {
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setTo(userEmail);
		mailMessage.setText("Hi "+userName+" you are "+Result);
		
		mailSender.send(mailMessage);
		
	}

	
}
