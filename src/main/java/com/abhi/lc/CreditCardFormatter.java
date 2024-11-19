package com.abhi.lc;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.abhi.lc.DTO.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard> {

	@Override
	public String print(CreditCard object, Locale locale) {
		// TODO Auto-generated method stub
		return object.getFirstFourDigits()+"-"+object.getSecondFourDigits()+"-"+object.getThirdFourDigits()+"-"+object.getLastFourDigits();
	}

	@Override
	public CreditCard parse(String text, Locale locale) throws ParseException {
		String[] arr = text.split("-");
		CreditCard creditCard=new CreditCard();
		creditCard.setFirstFourDigits(Integer.parseInt(arr[0]));
		creditCard.setSecondFourDigits(Integer.parseInt(arr[1]));
		creditCard.setThirdFourDigits(Integer.parseInt(arr[2]));
		creditCard.setLastFourDigits(Integer.parseInt(arr[3]));
		return creditCard;
	}

	

}
