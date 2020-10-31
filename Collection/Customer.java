package Assday5;

public class Customer {
	private int cid;
	private String cname,address,dob,mob;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	public Customer(int cid, String cname, String address, String dob, String mob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.dob = dob;
		this.mob = mob;
	}

	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + ", dob=" + dob + ", mob=" + mob
				+ "]";
	}
	
	
	

}
