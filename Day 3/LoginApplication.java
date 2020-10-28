import java.util.*;
public class LoginApplication {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		HashMap<String, String> db = new HashMap<>();
		db.put("ashwin","234");
		db.put("ash","441");
		db.put("as","119");
		db.put("a","134");
		
		String userName, password;
		
		System.out.println("Enter user name");
		userName = s.next();
		System.out.println("Enter password");
		password = s.next();
		
		if(db.containsKey(userName) && password.equals(db.get(userName)))
			System.out.println("Welcome");
		else
			System.out.println("Acess Denied");
		}
}
