package com.abhi.restsample.dto;

import java.util.Date;

public class ErrorResponseClass {
	
	private Date date;
	private String message;
	private String className;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

}
