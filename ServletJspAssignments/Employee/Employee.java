package com.hsbc.bean;

public class Employee {

		String id,name,department;
		int sal;
		/**
		 * 
		 */
		public Employee() {
			super();
		}
		
		public Employee(String id, String name, String department, int sal) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.sal = sal;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public int getSal() {
			return sal;
		}

		public void setSal(int sal) {
			this.sal = sal;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", sal=" + sal + "]";
		}

		
}
