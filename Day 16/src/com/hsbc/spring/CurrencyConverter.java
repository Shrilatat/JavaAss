package com.hsbc.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CurrencyConverter {
	
	//@Autowired
	//@Qualifier("es1")
	@Resource(name="es2")		//JSR from java standard not spring
	ExchangeService exchangeService;
	
	public double dollarsToRupees(double dollars)
	{
		return dollars * ExchangeService.getExchangeRate();
	}

	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}

}
