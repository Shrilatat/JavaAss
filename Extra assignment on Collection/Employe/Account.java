package com.hsbc.AssignCollect;

import java.util.Date;

public class Account {
     
	private int accId;
	private String name ;
	private String type;
	private double bal ;
	private Date date ;

	public Account(int accId, String name, String type, double bal, Date date) {
		super();
		this.accId = accId;
		this.name = name;
		this.type = type;
		this.bal = bal;
		this.date = date;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
}
