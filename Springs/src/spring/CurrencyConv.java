package spring;

public class CurrencyConv {

	ExchangeService exchangeService;

	public double dollarsToRs(double dollars) {
		return dollars * exchangeService.getExchangeRate();
	}

	public ExchangeService getExchangeService() {
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}
}
