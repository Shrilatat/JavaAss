package com.trg.responsebody;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("employees")
public class EmpController {
	Emp emp = new Emp();

	@GetMapping(value = "/{name}", produces = "application/json")
	public @ResponseBody Emp getEmpInJSON(@PathVariable String name) {
		emp.setName(name);
		emp.setEmail("emp1@myorg.com");
		return emp;
	}

	@GetMapping(value = "/{name}.xml", produces = "application/xml")
	public @ResponseBody Emp getEmpInXML(@PathVariable String name) {
		emp.setName(name);
		emp.setEmail("emp1@myorg.com");
		return emp;
	}
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "hello";
	}
	
	
}
