package com.hsbc.AssignCollect;

import java.util.Date;

public abstract class MedicineManf {
	
	private int price ;
	private Date date ;
	
	public MedicineManf() {
		
	}

    
	public MedicineManf(int price, Date date) {
		this.price = price;
		this.date = date;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "MedicineManf [price=" + price + ", date=" + date + "]";
	}


	public abstract void displayLabel();

}
