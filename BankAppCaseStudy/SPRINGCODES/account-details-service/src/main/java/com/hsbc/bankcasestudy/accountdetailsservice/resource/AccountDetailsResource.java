package com.hsbc.bankcasestudy.accountdetailsservice.resource;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.bankcasestudy.accountdetailsservice.dao.CustomerAccountDao;
import com.hsbc.bankcasestudy.accountdetailsservice.model.CustomerAccount;
import com.hsbc.bankcasestudy.accountdetailsservice.model.CustomerAccountDetails;
import com.hsbc.bankcasestudy.accountdetailsservice.model.Customer;
import com.hsbc.bankcasestudy.accountdetailsservice.dao.CustomerDao;

@RestController
@RequestMapping("/accounts")
public class AccountDetailsResource {
	
	CustomerAccountDao dao = new CustomerAccountDao();
	CustomerDao cdao = new CustomerDao();
	@Autowired
	RestTemplate restTemplate;
	@CrossOrigin(origins="http:localhost:4200")
	@RequestMapping("/{customerId}")
	public CustomerAccount getCustomerAccountInfo(@PathVariable("customerId") String customerId){
		return dao.getCustomerAccountById(Integer.parseInt(customerId));
	}
	 
	@CrossOrigin(origins="http:localhost:4200")
	@RequestMapping("/{customerId}/")
	public CustomerAccountDetails getCustomerInfo(@PathVariable("customerId") String customerId){
		Customer c = new Customer();
		CustomerAccount a = dao.getCustomerAccountById(Integer.parseInt(customerId));
		c= (Customer) restTemplate.getForObject("http://localhost:8080/customer/"+customerId, Customer.class);
		CustomerAccountDetails ca = new CustomerAccountDetails(c.getCustomerId(), a.getAccountId(), c.getCustomerName(), c.getAddress(), a.getBalance());
		return ca;
	}

}
