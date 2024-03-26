package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SecondController {
	//요청패스
	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();
		board.setSeq(1);
		board.setTitle("title");
		board.setWriter("kimmaldong");
		board.setContent("greeting");
		board.setCreateDate(new Date());
		board.setCnt(0);
		return board;
	}
	@GetMapping("/getBoardList")
	public List<BoardVO> getBoardList() {
		List<BoardVO> Boardlist = new ArrayList<BoardVO>();
		for(int i = 1;i<=10;i++) {
			BoardVO board = new BoardVO();
			board.setSeq(1);
			board.setTitle("title:" + i);
			board.setWriter("kimmaldong");
			board.setContent("greeting");
			board.setCreateDate(new Date());
			board.setCnt(0);
		Boardlist.add(board);
		}
		return Boardlist;
	}
	
}