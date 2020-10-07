package com.hsbc;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public ModelAndView m1()
	{
		String date = new Date().toString();
		return new ModelAndView("hello" , "mydata" , date);
	}

}
