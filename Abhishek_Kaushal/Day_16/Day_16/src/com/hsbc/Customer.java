package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	@Value("101")
	int custId;

	@Autowired
	Customer customerName;
	
	@Autowired
	Address billingAddress;
	
	@Autowired
	Contact contactDetails;
	
	@Autowired
	Address ShippingAddress;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Customer getCustomerName() {
		return customerName;
	}

	public void setCustomer(Customer customerName) {
		this.customerName = customerName;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Contact getContactDetails() {
		return contactDetails;
	}

	public void setContact(Contact contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Address getShippingAddress() {
		return ShippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		ShippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", billingAddress=" + billingAddress
				+ ", contactDetails=" + contactDetails + ", ShippingAddress=" + ShippingAddress + "]";
	}



}
