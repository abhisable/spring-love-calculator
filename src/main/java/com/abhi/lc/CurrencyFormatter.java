package com.abhi.lc;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.abhi.lc.DTO.Amount;

public class CurrencyFormatter implements Formatter<Amount> {

	@Override
	public String print(Amount object, Locale locale) {
		return object.getBillAmount()+" "+object.getCurrencyCode();
	}

	@Override
	public Amount parse(String text, Locale locale) throws ParseException {
		String[] arr = text.split(" ");
		Amount amount = new Amount();
		amount.setBillAmount(new BigDecimal(arr[0]));
		amount.setCurrencyCode(arr[1]);
		return amount;
	}

}
