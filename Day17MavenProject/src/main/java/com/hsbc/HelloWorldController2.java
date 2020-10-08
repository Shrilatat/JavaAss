package com.hsbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController2 {

	@RequestMapping("/helloWorld2")
//	public String m1(Map map) {
//
//		map.put("name", "Amisha");
//		map.put("date", new Date());
//
//		return "hello";
//	}

//	public String m1(Model model)
//	{
//		
//		model.addAttribute("name", "Amisha");
//		model.addAttribute("date", new Date());
//		
//		return "hello";
//	}
	
	public String m1(Model model)
	{
		List<String> list = Arrays.asList("aaa","bbb","ccc");
		model.addAttribute("list", list);
		
		return "hello";
	}
}
