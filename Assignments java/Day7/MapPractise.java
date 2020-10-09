package day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractise {
public static void main(String[] args) {
	String iuser="User2";
	String ipass="This is secret";
			
	Map<String,String> user=new HashMap<>();
	user.put("User1","HelloWOrld");
	user.put("User2", "This is scret");
	user.put("User3", "PasswordProt");
	
	Set<String>keys=user.keySet();
	int a=0;
	for(String key:keys) {
		String username=key;
		String password=user.get(key);
		if((iuser.equals(username))&& (ipass.equals(password))) {
			a=1;
			System.out.println("Valid user");
		}
	}
	if(a==0) {
		System.out.println("Invalid user");
	}
	
}}
