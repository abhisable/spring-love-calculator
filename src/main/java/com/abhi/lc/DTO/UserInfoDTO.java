package com.abhi.lc.DTO;


import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "your name can't be null")
	@Size(min=3,max=15,message="yourName should be between 3 and 15")
	private String yourName;
	
	@NotBlank(message = "crush name can't be null")
	@Size(min=3,max=15,message="crush should be between 3 and 15")
	private String crushName;
	
	@AssertTrue(message=" please check term and condition to proceed with our app")
	private boolean termAndContitionCheck;
	
	
	public UserInfoDTO() {
		//System.out.println("Hi UserInfoDTO constructor called spring internally creating this object");
	}
	public String getYourName() {
		return yourName;
	}
	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}
	public boolean isTermAndContitionCheck() {
		return termAndContitionCheck;
	}
	public void setTermAndContitionCheck(boolean termAndContitionCheck) {
		this.termAndContitionCheck = termAndContitionCheck;
	}
	
	
	
}
