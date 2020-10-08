package com.hsbc;

public class CurrencyConverter {
	
	double exchangeRate;
	ExchangeService exchangeService ;

//	public CurrencyConverter(double exchangeRate) {
//		super();
//		this.exchangeRate = exchangeRate;
//	}

//	public double getExchangeRate() {
//		return exchangeRate;
//	}
//
//	public void setExchangeRate(double exchangeRate) {
//		this.exchangeRate = exchangeRate;
//	}
	
	public void setExchangeService(ExchangeService es)
	{
		exchangeService = es;
	}
	
	public ExchangeService getExchangeService()
	{
		return exchangeService;
	}
	
	public double dollarsToRs(double dollars) {
		return dollars*exchangeService.getExchangeRate();
	}

}
