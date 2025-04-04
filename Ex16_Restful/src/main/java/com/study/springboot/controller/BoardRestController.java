package com.study.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.springboot.domain.Board;
import com.study.springboot.repository.BoardRepository;

@RestController
@RequestMapping("/rest")
public class BoardRestController {

	@Autowired
	BoardRepository boardRepository;

	@GetMapping("/boardall")
	public List<Board> getrecordAll() {
		return boardRepository.findAll();

	}

	@GetMapping("/boards")
	List<Board> getrecord(@RequestParam(value="title",required=false)String title,
							@RequestParam(value="content",required=false)String content){
		return boardRepository.findByTitleOrContent(title,content);
		
	}
	@GetMapping("/board/{bno}")
	public Board getBoard(@PathVariable("bno")Long bno) {
		Board b = boardRepository.findById(bno).get();
		return b;
		
	}
	
	
	
	@DeleteMapping("/boarddelete/{bno}")
	void deleteBoard(@PathVariable(name="bno") Long bno) {
		boardRepository.deleteById(bno);
		
	}

}
