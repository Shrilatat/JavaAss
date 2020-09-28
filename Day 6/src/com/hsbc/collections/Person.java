package com.hsbc.collections;

public class Person {

		
		int pid;
		String pname;
		int age;
		
		public Person() {}
		
		public Person(int pid, String pname, int age) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.age = age;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
		}

}
