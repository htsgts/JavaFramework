package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import com.rubypaper.dto.UserDTO;

@Controller
public class Controller3 {
	@PostMapping("/controller3")
	public String userform(UserDTO userDTO, Model model) {
		model.addAttribute("head", "springboot!");
		System.out.println("--------------------");
		System.out.println("userName : "+userDTO.getUserName());
		System.out.println("userId : "+userDTO.getUserId());
		System.out.println("userPhone : "+userDTO.getUserPhone());
		System.out.println("--------------------");
		
		return "/post/view3";
	}
}
