import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class ValidatePassword {
	private Map<String, String> data= new HashMap<>();
	public void database() {
		data.put("User1", "Password1");
		data.put("User2", "Password2");
		data.put("User3", "Password3");
		data.put("User4", "Password4");
		data.put("User5", "Password5");
		data.put("User6", "Password6");
		data.put("User7", "Password7");
	}
	
	public void validate(String user, String passw) {
		if(passw.equals((data.get(user))))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static void main(String[] args) {
		ValidatePassword vp= new ValidatePassword();
		Scanner user= new Scanner(System.in);
		Scanner pass= new Scanner(System.in);
		System.out.print("Enter Username:");
		String username=user.nextLine();
		System.out.print("Enter Password:");
		String password=pass.nextLine();
		vp.validate(username, password);
		
		
	}
}
