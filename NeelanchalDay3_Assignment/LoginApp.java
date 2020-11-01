import java.util.*;

public class LoginApp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String userName = "";
		String passWord = "";

		HashMap<String, String> map = new HashMap<>();
		map.put("Neel", "123");
		map.put("Neel1", "123");
		map.put("Neel2", "1235");
		map.put("Neel3", "1236");

		System.out.println("Enter user Name ");
		userName = s.next();
		System.out.println("Enter Password ");
		passWord = s.next();

		boolean flag = false;
		if (map.containsKey(userName) && passWord.equals(map.get(userName)))
			flag = true;
		
		if (flag)
			System.out.println("Login Succesfull");
		else
			System.out.println("Access Denied ");
	}
}
