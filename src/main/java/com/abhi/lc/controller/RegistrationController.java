package com.abhi.lc.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.CommunicationDTO;
import com.abhi.lc.DTO.Phone;
import com.abhi.lc.DTO.UserRegistrationDTO;
import com.abhi.lc.Validator.UserNameCustomValidator;
import com.abhi.lc.editors.NameCustomEditor;

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
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields("userName"); //by this line we are setting userName as disallowed field so it won't get binded
		
		StringTrimmerEditor editor=new StringTrimmerEditor(false);//passing true converts whitespaces to null object
		binder.registerCustomEditor(String.class, "user", editor);
		System.out.println("inside init binder ");
		
		NameCustomEditor nameEditor=new NameCustomEditor();
		binder.registerCustomEditor(String.class,"user", nameEditor);
		
		binder.addValidators(new UserNameCustomValidator());
	}

}
