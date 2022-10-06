package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	
	@RequestMapping(value= {"/"})
	public String display(Model model) {
		model.addAttribute("username","sagar");
		return "practise.html";
	}

	@RequestMapping(value= {"/home"})
	public String display1() {
		return "home.html";
	}
	@RequestMapping(value= {"/about"})
	public String display2() {
		return "about.html";
	}
	
}
