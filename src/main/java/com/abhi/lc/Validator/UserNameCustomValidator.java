package com.abhi.lc.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.abhi.lc.DTO.UserRegistrationDTO;

public class UserNameCustomValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "UserName.Empty", "username is either empty or has whitespace");
		UserRegistrationDTO dto=(UserRegistrationDTO)target;
		if(!dto.getUserName().contains("_")) {
			errors.rejectValue("userName", "UserName.NotContainUnderScore", "username should contain _");
		}
		
	}

}
