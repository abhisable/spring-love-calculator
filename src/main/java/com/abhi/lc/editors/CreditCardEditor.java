package com.abhi.lc.editors;

import java.beans.PropertyEditorSupport;

import com.abhi.lc.DTO.CreditCard;

public class CreditCardEditor extends PropertyEditorSupport {
	@Override
	public String getAsText() {
		CreditCard value = (CreditCard)getValue();
		return "sample: "+value;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] arr = text.split("-");
		CreditCard creditCard = new CreditCard();
		creditCard.setFirstFourDigits(Integer.parseInt(arr[0]));
		creditCard.setSecondFourDigits(Integer.parseInt(arr[1]));
		creditCard.setThirdFourDigits(Integer.parseInt(arr[2]));
		creditCard.setLastFourDigits(Integer.parseInt(arr[3]));
		setValue(creditCard);
	}

}
