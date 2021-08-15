package com.swrookie.onboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "eric");
		return "view/index";
	} 
	
	@GetMapping("/")
	public String index() {
		return "view/index";
	}
}
