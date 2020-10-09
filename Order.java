package com.hsbc.database;

public class Order {
	private int onumber;
	private String oname;
	private int oprice;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int onumber, String oname, int ovalue) {
		super();
		this.onumber = onumber;
		this.oname = oname;
		this.oprice = ovalue;
	}
	public int getOnumber() {
		return onumber;
	}
	public void setOnumber(int onumber) {
		this.onumber = onumber;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public int getOPrice() {
		return oprice;
	}
	public void setOPrice(int ovalue) {
		this.oprice = ovalue;
	}
	@Override
	public String toString() {
		return "Order [onumber=" + onumber + ", oname=" + oname + ", ovalue=" + oprice + "]";
	}
	

}
