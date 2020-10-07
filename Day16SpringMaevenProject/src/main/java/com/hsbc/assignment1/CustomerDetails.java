package com.hsbc.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cusdetObj")
public class CustomerDetails {

	@Value("1111")
	int custId;

	@Autowired
	CustomerNameDetails customerName;
	@Autowired
	AddressDetails billingAddress;
	@Autowired
	ContactDetails contactDetails;
	@Autowired
	AddressDetails ShippingAddress;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public CustomerNameDetails getCustomerName() {
		return customerName;
	}

	public void setCustomerName(CustomerNameDetails customerName) {
		this.customerName = customerName;
	}

	public AddressDetails getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(AddressDetails billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public AddressDetails getShippingAddress() {
		return ShippingAddress;
	}

	public void setShippingAddress(AddressDetails shippingAddress) {
		ShippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "CustomerDetails [custId=" + custId + ", customerName=" + customerName + ", billingAddress="
				+ billingAddress + ", contactDetails=" + contactDetails + ", ShippingAddress=" + ShippingAddress + "]";
	}

}