package com.swrookie.onboard.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.swrookie.onboard.dto.BoardDto;
import com.swrookie.onboard.service.BoardService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardController {
	private BoardService boardService;
	
	@GetMapping("/")
	public String read(Model model) {
		List<BoardDto> boardDtoList = boardService.getBoardList();
		model.addAttribute("boardDtoList", boardDtoList);
		
		return "board/index";
	}
	
	@GetMapping("/create")
	public String create() {
		return "board/write";
	}
	
	@PostMapping("/create")
	public String create(BoardDto boardDto) {
		boardService.setBoard(boardDto);
		
		return "redirect:/";
	}
}
