package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller2 {
	//2
	@GetMapping("/user/param")
	public String param(@RequestParam ("userid") String uid, @RequestParam ("password") String pw,
			 @RequestParam ("email") String email, @RequestParam ("hp") String hp, Model model) {
		model.addAttribute("userid",uid);
		model.addAttribute("password", pw);
		model.addAttribute("email", email);
		model.addAttribute("hp", hp);
		return "/user/param";
	}
	
	
	@GetMapping("/user/data")
	public String data(Model model) {
		model.addAttribute("name", "parkdohun");
		
		return "/user/data";
	}
}