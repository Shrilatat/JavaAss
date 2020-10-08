package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CCClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CurrencyConverter cc = new CurrencyConverter();
//		ExchangeService es = new ExchangeService();
//		cc.setExchangeService(es);
		
		//CurrencyConverter cc = new CurrencyConverter();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		CurrencyConverter cc = ctx.getBean("currencyConverter" , CurrencyConverter.class);
		
		//cc.setExchangeRate(74.0);
		//CurrencyBean cb = ctx.getBean("cb", CurrencyBean.class);
		
		System.out.println(cc.dollarsToRs(100));
		//System.out.println(cb.getCurrencies());

	}

}
