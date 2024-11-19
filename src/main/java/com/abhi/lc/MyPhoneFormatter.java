package com.abhi.lc;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.abhi.lc.DTO.Phone;

public class MyPhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		return object.getCountryCode()+"-"+object.getPhoneNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		Phone phone = new Phone();
		String[] phoneArr = text.split("-");
		int indexOfHypen = text.indexOf('-');
		if (indexOfHypen > 0) {

			phone.setCountryCode(phoneArr[0]);
			phone.setPhoneNumber(phoneArr[1]);
		} else if (indexOfHypen == 0) {
			phone.setCountryCode("91");
			phone.setPhoneNumber(phoneArr[1]);
		} else {
			phone.setCountryCode("91");
			phone.setPhoneNumber(phoneArr[0]);
		}
		return phone;
	}

}
