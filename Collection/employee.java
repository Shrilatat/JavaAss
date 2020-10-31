package Assday5;

public abstract class employee {
	private int id;
	private String name;
	private String mail;
	private String dept;
	private String desg;
	private String doj;
	
	public employee(int id, String name, String mail, String dept, String desg, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}
	
	public void DispDetail() {
		System.out.println("employee [id=" + id + ", name=" + name + ", p_no=" + mail + ", dept=" + dept + ", desg=" + desg
				+ ", doj=" + doj + "]");
	}

	abstract void calcsalry();

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
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
}
