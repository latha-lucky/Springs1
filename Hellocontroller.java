package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Hellocontroller {
	@RequestMapping("hello")
	public String hello() {
		return "hellopage";
	}
	@RequestMapping("hello1")
	public String hello1() {
		return "secondpage";
	}

}
