package com.hsbc.bankcasestudy.bankmanagerservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.bankcasestudy.bankmanagerservice.dao.CustomerAccountDao;
import com.hsbc.bankcasestudy.bankmanagerservice.model.Customer;
import com.hsbc.bankcasestudy.bankmanagerservice.model.CustomerAccount;
import com.hsbc.bankcasestudy.bankmanagerservice.model.CustomerAccountDetails;


@RestController
@RequestMapping("/accounts")
public class BankManagerResource {

	
	CustomerAccountDao dao = new CustomerAccountDao();
	@Autowired
	RestTemplate restTemplate;
	
	@CrossOrigin(origins="http:localhost:4200")
	@RequestMapping("/{customerId}")
	public CustomerAccountDetails getCustomerInfo(@PathVariable("customerId") String customerId){
		Customer c = new Customer();
		CustomerAccount a = dao.getCustomerAccountById(Integer.parseInt(customerId));
		c= (Customer) restTemplate.getForObject("http://localhost:8081/account/"+customerId+"/", Customer.class);
		CustomerAccountDetails ca = new CustomerAccountDetails(c.getCustomerId(), a.getAccountId(), c.getCustomerName(), c.getAddress(), a.getBalance());
		return ca;
	}

	
}
