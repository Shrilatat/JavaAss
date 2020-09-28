import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Users{
	int id;
	Map<String,String> db = new HashMap<>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, String> getDb() {
		return db;
	}

	public void setDb(Map<String, String> db) {
		this.db = db;
	}

	
	@Override
	public String toString() {
		return "Users [id=" + id + ", db=" + db + "]";
	}
	
	public Users(int id, Map<String, String> db) {
		super();
		this.id = id;
		this.db = db;
	}
	
}

public class UserLogin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 
		Map<String,String> s1 = new HashMap<>();
		Map<String,String> s2 = new HashMap<>();
		Map<String,String> s3 = new HashMap<>();
		
		// Usernames and Passwords
		s1.put("first","abc");
		s1.put("second","pqr");
		s1.put("third","xyz");
		
		Users a = new Users(1,s1);
		Users b = new Users(2,s2);
		Users c = new Users(3,s3);
		
		Users[] myUsers = new Users[3];
		myUsers[0] = a;
		myUsers[1] = b;
		myUsers[2] = c;
		
		String name;
		String password;
			
		System.out.println("Enter username");
		name = scan.next();
			
		System.out.println("Enter password");
		password = scan.next();
			
		for(int i = 0; i < ){
			
		}
			
		}
		
		

	}

}
