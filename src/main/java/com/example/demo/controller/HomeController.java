package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {


	@GetMapping(value = "/home")
	public String home(Model model) {

		System.out.println(this.getClass().getName() + " [/home]");
		return "blog/home";
		
	}
	
}
