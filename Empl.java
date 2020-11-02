package com.jdbcassign2;

public class Empl {
	private int id;
	private String name;
	private double sal;
		
	public Empl(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Empl() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String toString() {
		return "Empl [name=" + name + ", sal=" + sal + ", id=" + id +"]";
	}
	
}
