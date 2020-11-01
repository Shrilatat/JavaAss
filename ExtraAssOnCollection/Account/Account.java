package com.hsbc.collection_Assignment;

public class Account {

	private int id;
	private String name,type;
	private double bal;
	private Date date;
	
	
	public Account(int id, String name, String type, double bal, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.bal = bal;
		this.date = date;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getType() {
		return type;
	}


	public double getBal() {
		return bal;
	}


	public Date getDate() {
		return date;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setBal(double bal) {
		this.bal = bal;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", type=" + type + ", bal=" + bal + ", date=" + date + "]";
	}
	
	
	
}
