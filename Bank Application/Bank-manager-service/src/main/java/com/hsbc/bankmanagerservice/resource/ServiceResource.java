package com.hsbc.bankmanagerservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.bankmanagerservice.model.Account;
import com.hsbc.bankmanagerservice.model.Customer;
import com.hsbc.bankmanagerservice.model.CustomerAccount;

@RestController
public class ServiceResource {

	@Autowired
	RestTemplate restTemplate;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/accounts/{custId}")
	public CustomerAccount getCategories(@PathVariable("custId") int custId) {

		Account account = restTemplate.getForObject("http://localhost:8090/accounts/" + custId, Account.class);
		Customer customer = restTemplate.getForObject("http://localhost:8080/customers/" + custId, Customer.class);
		System.out.println(customer);
		System.out.println(account);
		return new CustomerAccount(customer, account);

	}
}