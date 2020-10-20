package com.trg;

import org.springframework.beans.factory.annotation.Autowired;

public class CurrencyConverter {
	
	@Autowired
	//double exchRate;
	
	ExchangeService exchangeService;
	
	

	
	/*
	 * public CurrencyConverter(double exchRate) { super(); this.exchRate =
	 * exchRate; }
	 */
	/*
	 * public double getExchRate() { return exchRate; }
	 * 
	 * public void setExchRate(double exchRate) { this.exchRate = exchRate; }
	 */


	public ExchangeService getExchangeService() {
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}

	/*public double dollarsToRs(int dollars) {
		
		return dollars*exchRate;
	}*/
	
public double dollarsToRs(double dollars) {
		
		return dollars*exchangeService.getExchangeRate();

	}

	
	
	
}
