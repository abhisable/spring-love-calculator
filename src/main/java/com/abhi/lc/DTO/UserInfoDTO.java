package com.abhi.lc.DTO;

public class UserInfoDTO {

	private String yourName="Mr. X";
	private String crushName="Ms. Y";
	
	
	public UserInfoDTO() {
		System.out.println("Hi UserInfoDTO constructor called spring internally creating this object");
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
	
	
	
}
