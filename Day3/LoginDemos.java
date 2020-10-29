
import java.util.*;

public class LoginDemos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String,String> userdata = new HashMap<>();
		userdata.put("vishal", "101"); 
        userdata.put("sachin", "302"); 
        userdata.put("vaibhav", "203");
        String user=scan.next();
        String pass=scan.next();
        if(userdata.containsKey(user)) {
        	String word = userdata.get(user);
        	if(word.equals(pass)) {
        		System.out.println("success");
        	}
        	else {
        		System.out.println("password wrong");
        	}
        	
        }
        else {
        	System.out.println("user does not exist");
        }
        scan.close();
	}
}
