package com.hsbc;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController3 {

	@RequestMapping("/logincheck")
	public String onSubmit(@RequestParam("temperature") float temp,Model model) {
		
		float change=(temp-32)*5/9;
		model.addAttribute("temperature",change);
		return "convert";
	}
	
}
