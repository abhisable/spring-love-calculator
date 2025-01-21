package com.abhi.restsample.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.abhi.restsample.dto.ErrorResponseClass;

@ControllerAdvice
public class GloabalExceptionalHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponseClass> handleException(StudentNotFoundException exception){
		ErrorResponseClass response=new ErrorResponseClass();
		response.setClassName(exception.getClass().toString());
		response.setDate(new Date());
		response.setMessage(exception.getMessage());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}

}
