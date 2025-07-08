package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.BoardVO;
import com.example.service.BoardService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService service;
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);

	//게시판 리스트
	@GetMapping("/list")
	public void getList(Model model) throws Exception{
		
		log.info("게시판 리스트 메서드 진입");
		
		List<BoardVO> list = service.list();
		model.addAttribute("list", list);
		
		log.info("getList log:"+list.toString());
	}
	
	//게시글 작성 페이지
	@GetMapping("/write")
	public void getWrite() throws Exception{
		
	}
	
	//게시글 삽입 POST 방식
	@PostMapping("/write")
	public String postWrite(BoardVO vo) throws Exception{
		
		service.postWrite(vo);
		
		return "redirect:/board/list";
	}
	

}
