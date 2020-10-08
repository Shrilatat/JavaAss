package com.trg;

public class CurrencyConverter {
	double exchRate;

	public double getExchRate() {
		return exchRate;
	}

	public double dollrsToRs(double dollars)
	{
		return dollars* exchRate;
	}

	public CurrencyConverter(double exchRate) {
		super();
		this.exchRate = exchRate;
	}

}
