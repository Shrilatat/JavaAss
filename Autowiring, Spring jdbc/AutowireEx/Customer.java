package com.hsbc.AutowireEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cu")
public class Customer {
	@Value("101")
	int custId;
	
	@Autowired
	CustName custName;
	@Autowired
	Address billingAddr;
	@Autowired
	ContactDetails cdetails;
	@Autowired
	Address ShippingAddr;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public CustName getCustName() {
		return custName;
	}
	public void setCustName(CustName custName) {
		this.custName = custName;
	}
	public Address getBillingAddr() {
		return billingAddr;
	}
	public void setBillingAddr(Address billingAddr) {
		this.billingAddr = billingAddr;
	}
	public ContactDetails getCdetails() {
		return cdetails;
	}
	public void setCdetails(ContactDetails cdetails) {
		this.cdetails = cdetails;
	}
	public Address getShippingAddr() {
		return ShippingAddr;
	}
	public void setShippingAddr(Address shippingAddr) {
		ShippingAddr = shippingAddr;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}
	
	

}
