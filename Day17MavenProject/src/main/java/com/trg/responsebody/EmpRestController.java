package com.trg.responsebody;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restemployees")
public class EmpRestController {
	Emp emp = new Emp();

	@GetMapping(value = "/{name}", produces = "application/json")
	public Emp getEmpInJSON(@PathVariable String name) {
		emp.setName(name);
		emp.setEmail("emp1@myorg.com");
		return emp;
	}

	@GetMapping(value = "/{name}.xml", produces = "application/xml")
	public Emp getEmpInXML(@PathVariable String name) {
		emp.setName(name);
		emp.setEmail("emp1@myorg.com");
		return emp;
	}


@RequestMapping(value = "/name/names", produces = "application/json")
public List<String> hello(){
    return Arrays.asList("aaa","bbb","cccc");
}

}
