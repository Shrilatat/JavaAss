import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LoginApp {
	void validateUser(Map<String, String> map, String username, String password){
		if(map.containsKey(username)) {
			if(password.equals(map.get(username))) {
				System.out.println("Valid User");
			}else {
				System.out.println("Incorrect Password, try again");
			}
		}else {
			System.out.println("User doen't exist");
		}
	}
	public static void main(String[] args) {
		LoginApp la = new LoginApp();
		Map<String, String> map = new HashMap<>();
		map.put("Rajesh","rajesh123");
		map.put("Mahesh", "mahesh123");
		map.put("Suresh", "suresh123");
		map.put("Kamlesh", "kamlesh123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Username");
		String username = sc.next();
		System.out.println("Input Password");
		String password = sc.next();
		la.validateUser(map, username, password);
	}
	
	
}
