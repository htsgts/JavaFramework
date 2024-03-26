package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
//단순요청
	@GetMapping("/main")
	public String add() {
		return "/main/main";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "post/home";
	}
	
	
}
