package com.abhi.lc.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MyValidator implements ConstraintValidator<Age, Integer> {
	private Integer lower;
	private Integer upper;

	@Override
	public void initialize(Age age) {
		this.lower = age.lower();
		this.upper = age.upper();
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if (value == null || value < lower || value > upper)
			return false;
		return true;
	}

}
