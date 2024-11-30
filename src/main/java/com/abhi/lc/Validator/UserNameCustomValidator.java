package com.abhi.lc.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.abhi.lc.DTO.UserRegistrationDTO;

@Component
public class UserNameCustomValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "UserName.Empty");
		UserRegistrationDTO dto=(UserRegistrationDTO)target;
		if(!dto.getUserName().contains("_")) {
			errors.rejectValue("userName", "UserName.NotContainUnderScore");
		}
		
	}

}
