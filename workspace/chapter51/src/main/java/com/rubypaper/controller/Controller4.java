package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.UserDTO;
@Controller
public class Controller4 {
	@GetMapping("/form4")
	public String getmain() {
		
		return "/post/form4";
	}
	@PostMapping("/view4") //객체 달고 넘김
	public String postmain(UserDTO userDTO, Model model) {
		System.out.println("------------------------");
		System.out.println("userName:"+ userDTO.getUserName());
		System.out.println("userID:"+ userDTO.getUserID());
		System.out.println("userPhone:"+ userDTO.getUserPhone());
		System.out.println("------------------------");
		model.addAttribute("heading", "object 전달");
		return "/post/view4";
	}

}
