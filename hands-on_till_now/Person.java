package day6;

public class Person implements Comparable<Person>{
	int pid;
	String pname;
	int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String pname, int age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
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
	public int compareTo(Person arg0) {
		return this.getPid()-arg0.getPid();
		//return this.getPname().compareTo(arg0.getPname());
		//return (this.getPid()>arg0.getPid()?1:this.getPid()<arg0.getPid()?-1:0);
	}
	
	
}
