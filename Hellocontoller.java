package com.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Hellocontoller {
	@RequestMapping("hello")//method level @used url to provide path to the service  methods public ModelAndView
	public ModelAndView hello() {
		ModelAndView view =new ModelAndView("Hellopage");
		view.addObject("hi","first mvc application");
		return view;
	}

}
