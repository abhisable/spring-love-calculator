package com.abhi.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.CommunicationDTO;
import com.abhi.lc.DTO.Phone;
import com.abhi.lc.DTO.UserRegistrationDTO;

import jakarta.validation.Valid;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String registration(@ModelAttribute("userRegInfo") UserRegistrationDTO regDTO) {
		regDTO.setUserName("demousername");

		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setPhoneNumber("000000000000");

		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);

		regDTO.setCommunicationDTO(communicationDTO);

		return "user-registration-page";
	}

	@RequestMapping("/registration-success")
	public String processRegistration(@Valid @ModelAttribute("userRegInfo") UserRegistrationDTO regDTO,
			BindingResult result) {
		if (result.hasErrors()) {
			for (Object error : result.getAllErrors()) {
				System.out.println(error);
			}
			return "user-registration-page";
		}
		return "registration-success";
	}

}
