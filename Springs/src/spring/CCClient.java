package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CCClient {
public static void main(String[] args) {
	/*
	 * CurrencyConv cc=new CurrencyConv(); cc.setExchRate(74.0);
	 */
	ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");
	//CurrencyConv cc=ctx.getBean("cc",CurrencyConv.class);
	
	//System.out.println(cc.dollarsToRs(100));//setter injection(value is injected using setter method in xml)

	/*
	 * ExchangeService es=new ExchangeService(); CurrencyConv cc=new CurrencyConv();
	 * cc.setExchangeService(es); System.out.println(cc.dollarsToRs(100));
	 */
	Currencybean bean=ctx.getBean("cb",Currencybean.class);
	System.out.println(bean.getCurrencies());
}
}
