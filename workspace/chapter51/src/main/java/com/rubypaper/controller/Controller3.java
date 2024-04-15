package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller3 {
	@PostMapping("/post/post")
	public String post(@RequestParam String membername,
			           @RequestParam String memberid,
			           Model model) {
		model.addAttribute("membername", membername);
		model.addAttribute("memberid",memberid);		
		return "/post/post";
	}

}
