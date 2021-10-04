package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.BoardDTO;
import com.example.demo.service.BoardService;


@Controller
public class HomeController {

	@Autowired
	private BoardService boardService;

	@GetMapping(value = {"/home","/"})
	public String home(Model model) {

		System.out.println(this.getClass().getName() + " [/, /home]");
		
		List<BoardDTO> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		
		return "blog/home";
		
	}
	
}
