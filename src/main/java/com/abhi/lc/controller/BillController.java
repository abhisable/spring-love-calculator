package com.abhi.lc.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.Amount;
import com.abhi.lc.DTO.BillDTO;
import com.abhi.lc.DTO.CreditCard;
import com.abhi.lc.editors.CreditCardEditor;

@Controller
public class BillController {

	@RequestMapping("/bill")
	public String generateBill(@ModelAttribute("bill") BillDTO billDTO) {
        billDTO.setAmount(new Amount());
        billDTO.getAmount().setBillAmount(new BigDecimal("3234"));
        billDTO.getAmount().setCurrencyCode("INR");
        
        CreditCard card=new CreditCard();
        card.setFirstFourDigits(1234);
        card.setSecondFourDigits(5456);
        card.setThirdFourDigits(3478);
        card.setLastFourDigits(2064);
        
        billDTO.setCreditCard(card);
        
		return "generate-bill";
	}

	@RequestMapping("/process-bill")
	public String requestMethodName(@ModelAttribute("bill") BillDTO billDTO) {
		return "display-bill";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CreditCardEditor editor=new CreditCardEditor();
		binder.registerCustomEditor(CreditCard.class, "creditCard",editor);
	}

}
