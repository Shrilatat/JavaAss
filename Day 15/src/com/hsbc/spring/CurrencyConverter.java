package com.hsbc.spring;

public class CurrencyConverter {
	
	ExchangeService exchangeService;
	
	public double dollarsToRupees(double dollars)
	{
		return dollars * ExchangeService.getExchangeRate();
	}


	public ExchangeService getExchangeService() {
		return exchangeService;
	}


	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}

}
