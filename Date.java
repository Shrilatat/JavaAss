package com.assign1;


public class Date {
	private int intDay, intMonth, intYear;

	public Date(int intDay, int intMonth, int intYear) {
		super();
		this.intDay = intDay;
		this.intMonth = intMonth;
		this.intYear = intYear;
	}
	

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String toString() {
		return "Date [intDay=" + intDay + ", intMonth=" + intMonth + ", intYear=" + intYear + "]";
	}

	public int getIntDay() {
		return intDay;
	}

	public void setIntDay(int intDay) throws DateException {
		if(intDay>=1 && intDay<=31)
			this.intDay = intDay;
		else
			throw new DateException("Date is Invalid");
	}

	public int getIntMonth() {
		return intMonth;
	}

	public void setIntMonth(int intMonth) {
		if(intMonth>=1 && intMonth<=12)
			this.intMonth = intMonth;
	}

	public int getIntYear() {
		return intYear;
	}

	public void setIntYear(int intYear) {
		if(intYear<1984)
			this.intYear = intYear;
	}
	public static void main(String[] args) throws DateException {
		Date D= new Date();
		D.setIntDay(22);
		D.setIntMonth(01);
		D.setIntYear(1969);
		System.out.println(D);
	}
	
}
