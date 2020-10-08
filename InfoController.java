package com.hsbc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InfoController {
    
	
	@RequestMapping(value="/process")
	public String processForm(@RequestParam("firstname") String fname,@RequestParam("lastname") String lname,@RequestParam("city") String city,@RequestParam("email") String email, Model model) {
		    List<User> list=Arrays.asList(new User(fname,lname,city,email));
			Iterator<User> i1=list.iterator();
			while(i1.hasNext()) {
				User user=i1.next();
				model.addAttribute("firstname", user.getFirstName());
				model.addAttribute("lastname", user.getLastName());
				model.addAttribute("email", user.getEmail());
			}
		return "success";
		
	}
}
