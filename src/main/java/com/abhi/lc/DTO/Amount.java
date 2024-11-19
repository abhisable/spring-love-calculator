package com.abhi.lc.DTO;

import java.math.BigDecimal;
import java.util.Currency;

public class Amount {
	private BigDecimal billAmount;
	private String currencyCode;
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	@Override
	public String toString() {
		Currency curr=Currency.getInstance(currencyCode);
	    return curr.getSymbol()+""+billAmount.toString();
		
	}
    
}
