package com.example.Lession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("LController")
public class LController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "HelloWorld!!";
	}

}
