package com.hsbc.employee;

public class EmployeeBean {

	int eId, eSal;
	String eName, eDept;

	public EmployeeBean(int eId, int eSal, String eName, String eDept) {
		super();
		this.eId = eId;
		this.eSal = eSal;
		this.eName = eName;
		this.eDept = eDept;
	}


	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int geteSal() {
		return eSal;
	}

	public void seteSal(int eSal) {
		this.eSal = eSal;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDept() {
		return eDept;
	}

	public void seteDept(String eDept) {
		this.eDept = eDept;
	}

	public EmployeeBean() {
		super();

	}

	@Override
	public String toString() {
		return "EmployeeBean [eId=" + eId + ", eSal=" + eSal + ", eName=" + eName + ", eDept=" + eDept + "]";
	}

}
