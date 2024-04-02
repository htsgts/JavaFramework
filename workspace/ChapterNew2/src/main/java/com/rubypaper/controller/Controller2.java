package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller2 {
	@PostMapping("user/post/post")
	public String post(@RequestParam String membername,
			@RequestParam String memberid,
			Model model) {
		model.addAttribute("membername", membername);
		model.addAttribute("memberid", memberid);
		return "user/post/post";
	}
	
	//2
	@GetMapping("/user/params")
	public String param(@RequestParam("uid") String id,
			@RequestParam("uname") String name,
			@RequestParam("uemail") String email,
			@RequestParam("uhp") String hp,
			Model model) {
		model.addAttribute("uid", id);
		model.addAttribute("uname", name);
		model.addAttribute("uemail", email);
		model.addAttribute("uhp", hp);
		return "/user/params";
	}
	
	//1
	@GetMapping("/user/data")
	public String data(Model model) {
		model.addAttribute("name", "moonseungsin");
		return "/user/data";
	}
}
