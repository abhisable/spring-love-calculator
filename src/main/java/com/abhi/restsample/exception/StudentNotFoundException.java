package com.abhi.restsample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public StudentNotFoundException() {
		
	}
    public StudentNotFoundException(String message) {
		super(message);
	}
}  
