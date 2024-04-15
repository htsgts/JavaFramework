package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.UserDTO;

@Controller
public class Controller4 {
	@GetMapping("/form4")
	public String getamain() {
		return "/post/form4";
	}
	@PostMapping("/view4")
	public String getamain2(UserDTO userDTO, Model model) {
		System.out.println("--------------------");
		System.out.println("userName : "+userDTO.getUserName());
		System.out.println("userId : "+userDTO.getUserId());
		System.out.println("userPhone : "+userDTO.getUserPhone());
		System.out.println("--------------------");
		model.addAttribute("heading", "User Information");
		
		return "/post/view4";
	}
}
