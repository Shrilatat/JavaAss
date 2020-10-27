package com.hsbc.accountdetailsservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.accountdetailsservice.dao.AccountDetailsDao;
import com.hsbc.accountdetailsservice.model.Account;


@RestController
@RequestMapping("/accounts")
public class AccountDetailsResource {

	@Autowired
	AccountDetailsDao dao;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/{custId}")
	public Account getAccountById(@PathVariable("custId") int id) {
		return dao.getAccountById(id);
	}
}
