package JavaAss;

import java.util.HashMap;
import java.util.Scanner;

public class loginSystem {

	private static HashMap<String, String> dataHashMap = new HashMap<String, String>();

	public void Register(String username, String password) {
		dataHashMap.put(username, password);

		System.out.println("user saved");
	}

	public void Login(String username, String password) {

		if (dataHashMap.containsKey(username)) {

			if (dataHashMap.get(username).equals(password)) {
				System.out.println("login successful");
			} else {
				System.out.println("password is wrong ");
			}

		} else {
			System.out.println("user not present in db");
		}

		System.out.println("user saved");
	}

	public static void main(String[] args) {
		loginSystem lSystem = new loginSystem();
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		String password = scanner.next();

		lSystem.Register(username, password);
		lSystem.Login(username, password);

	}

}
