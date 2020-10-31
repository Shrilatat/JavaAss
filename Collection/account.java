package Assday5;

public class account {
	private int acc_id;
	private String name;
	private String type;
	private double balance;
	private String doc;
	
	public account(int acc_id, String name, String type, double balance, String doc) {
		super();
		this.acc_id = acc_id;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.doc = doc;
	}

	public account() {
		// TODO Auto-generated constructor stub
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	
	public String toString() {
		return "account [acc_id=" + acc_id + ", name=" + name + ", type=" + type + ", balance=" + balance + ", doc="
				+ doc + "]";
	}

	
}