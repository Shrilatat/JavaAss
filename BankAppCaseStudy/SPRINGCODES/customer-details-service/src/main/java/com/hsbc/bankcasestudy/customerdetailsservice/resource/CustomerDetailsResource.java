package com.hsbc.bankcasestudy.customerdetailsservice.resource;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.bankcasestudy.customerdetailsservice.dao.CustomerDao;
import com.hsbc.bankcasestudy.customerdetailsservice.model.Customer;



@RestController
@RequestMapping("/customer")
public class CustomerDetailsResource {
	
	CustomerDao dao = new CustomerDao();
	
	@CrossOrigin(origins="http:localhost:4200")
	@RequestMapping("/{customerId}")
	public Customer getCustomerInfo(@PathVariable("customerId") String customerId){
		return dao.getCustomerById(Integer.parseInt(customerId));
	}
	
	@CrossOrigin(origins="http:localhost:4200")
	@PostMapping("/")
	public Customer addCustomer(@RequestBody Customer c) {
		int rowsAffected=dao.createCustomer(c);
		System.out.println(rowsAffected);
		return c;
	}
}
