package com.hsbc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemperatureController {

	@RequestMapping(value = "/convert", method = RequestMethod.GET)
	public String onSubmit(@RequestParam("temper") int temper, Model model) {
		int temp = ((temper - 32) * 5) / 9;
		System.out.println(temp);
		model.addAttribute("temp", temp);

		return "tempDisp";
	}

}
