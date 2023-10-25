package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/v1/hello")
	@ResponseBody
	public String hello(@RequestParam(value = "name", defaultValue = "Friend")String name) {
		String result = "Hello "+name;
		return result;
	}

}
