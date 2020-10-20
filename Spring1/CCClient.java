package com.trg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CCClient {
	
	public static void main(String[] args) {
		//CurrencyConverter cc = new CurrencyConverter();
		
		
		
		  ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		  //CurrencyBean bean = ctx.getBean("cb" , CurrencyBean.class);
		 // System.out.println(bean.getCurrencies());
		  
		  
		  
		 CurrencyConverter cc = ctx.getBean("cc" , CurrencyConverter.class);
		  
		  //cc.setExchRate(74.0); 
		  System.out.println(cc.dollarsToRs(100));
		 	
		
	//ExchangeService es = new ExchangeService();
	//CurrencyConverter cc1 = new CurrencyConverter();
	//cc1.setExchangeService(es);
	
	//System.out.println(cc1.dollarsToRs(100));
	
	
	}

}
