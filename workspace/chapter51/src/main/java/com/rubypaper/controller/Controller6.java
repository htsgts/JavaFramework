package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.dto.BoardDTO;

@Controller
public class Controller6 {
	@GetMapping("/view6")
	public String mainPage(Model model) {
		BoardDTO b1 = new BoardDTO(1, "7주차 수업", "홍길동");
		BoardDTO b2 = new BoardDTO(2, "지나가더친구집", "김하늘");
		BoardDTO b3 = new BoardDTO(3, "지나가던우리집", "이말자");
		BoardDTO b4 = new BoardDTO(4, "지나가던누나집", "김춘식");
		BoardDTO b5 = new BoardDTO(5, "지나가던형집", "박신형");
		BoardDTO b6 = new BoardDTO(6, "지나가던동생집", "배덕희");
		List<BoardDTO> bList = new ArrayList<>();
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		bList.add(b4);
		bList.add(b5);
		bList.add(b6);
		model.addAttribute("boardDTO", b1);
		model.addAttribute("bList", bList);
		return "/post/view6";
	}
}
