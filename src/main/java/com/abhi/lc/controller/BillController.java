package com.abhi.lc.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.lc.DTO.Amount;
import com.abhi.lc.DTO.BillDTO;

@Controller
public class BillController {

	@RequestMapping("/bill")
	public String generateBill(@ModelAttribute("bill") BillDTO billDTO) {
        billDTO.setAmount(new Amount());
        billDTO.getAmount().setBillAmount(new BigDecimal("3234"));
        billDTO.getAmount().setCurrencyCode("INR");
		return "generate-bill";
	}

	@RequestMapping("/process-bill")
	public String requestMethodName(@ModelAttribute("bill") BillDTO billDTO) {
		return "display-bill";
	}

}
