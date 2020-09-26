package exceptionhandling;

public class Emp {
	
	int empid;
	String ename;
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public void setEname(String ename) throws InvalidNameException  {
		if(ename == null)
			throw new InvalidNameException("Emloyee name cannot be null");
		else
		this.ename = ename;
	}
	
	

}
