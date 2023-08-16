package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Fristcontroller {
	@RequestMapping("hello")
	public String hello() {
		return "firstpage";
	}
	

}
