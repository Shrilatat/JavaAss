package day6;

import java.util.HashMap;
import java.util.Map;

class Database{
	Map<String, String> db = new HashMap<>();

	public Database() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void add(String id, String pass) {
		this.db.put(id, pass);
	}
	
	public void login(String id, String pass) {
//		if (db.containsKey(id))
//			if (pass.compareTo(db.get(id))) {
//				System.out.println("Login successfull");
//			} else 
//				System.out.println("Wrong password");
//		else 
//			System.out.println("No user");
			
	}
	
}
public class LoginDatabase {
	public static void main(String[] args) {
		Database database = new Database();
		database.add("Bharat","Bk");
		database.add("Abhinav","As");
		database.add("Pooja","Pg");
		database.add("Smriti","Sb");
		database.add("Parth","Pb");
		
		database.login("Bharat", "Bk");
		database.login("Abhinav", "Bk");
		database.login("Pooja1", "Pg");
		database.login("Bharat", "Bk");
		
	}
}
