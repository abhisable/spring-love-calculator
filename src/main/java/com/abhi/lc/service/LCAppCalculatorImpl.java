package com.abhi.lc.service;

import org.springframework.stereotype.Service;

@Service
public class LCAppCalculatorImpl implements LCAppCalculatorService{

	private final String key="FLAMES";
	@Override
	public String calculateLove(String userName, String crushName) {
		int lenAfterAddingNames=(userName+crushName).length();
		int lenOfFlames=key.length();
		int rem=lenAfterAddingNames%lenOfFlames;
		return getFlames(key.charAt(rem));
		
 	}

	@Override
	public String getFlames(char ch) {
		String result=null;
		if(ch=='F') {
			result="FRIENDS";
		}
		else if(ch=='L') {
			result="LOVE";
		}
		else if(ch=='A')
		{
			result="AFFECTION";
		}
		else if(ch=='M')
		{
			result="MARRIAGE";
		}
		else if(ch=='E')
		{
			result="ENEMIES";
		}
		else if(ch=='S')
		{
			result="SBILINGS";
		}
		return result;
	}

}
