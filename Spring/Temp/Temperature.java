package com.hsbc;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Temperature{

	@RequestMapping(value="/Temp", method = RequestMethod.GET)
	public String onSubmit(@RequestParam("Far") String far,Model model) 
	{
		//System.out.println(far);
		//Float.parseFloat("23.6");  
		double fa=Double.parseDouble(far);
		
		System.out.println(fa);
		double cel=(fa-32.0)*(5.0/9.0);// add num.0 it is double
		
		System.out.println(cel);
		model.addAttribute("celcius", cel);
		return "temp";
	}


}
