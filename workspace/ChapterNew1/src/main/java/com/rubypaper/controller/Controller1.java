package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controller1 {
	@GetMapping("/user/userInfo")
	public String userInfo() {
		return "user/userInfo";
	}
	//데이터 전달
	@GetMapping("/userdata")
	public String userdata(org.springframework.ui.Model model) {//데이터 주머니
		model.addAttribute("name", "이순신");
		model.addAttribute("achieve", "한산도 대첩");
		return "/user/userdata";
	}
}
