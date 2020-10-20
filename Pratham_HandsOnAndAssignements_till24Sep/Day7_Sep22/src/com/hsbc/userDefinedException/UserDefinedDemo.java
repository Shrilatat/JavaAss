package com.hsbc.userDefinedException;

class Emp {
	
	int eid;
	String ename;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) throws InvalidNameException {
		if(ename==null)
			throw new InvalidNameException("Cant be Null");
		else
			this.ename = ename;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + "]";
	}
	
}
public class UserDefinedDemo {
	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.setEid(102);
		
		try {
			e1.setEname(null);
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(e1);
	}
}
