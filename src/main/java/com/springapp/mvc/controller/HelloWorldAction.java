package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class HelloWorldAction {

	@RequestMapping(value = "/index.htm")
	public ModelAndView index(ModelMap model){
		model.addAttribute("message", "欢迎来到velocity的世界!");
		return new ModelAndView("welcome");
	}

}