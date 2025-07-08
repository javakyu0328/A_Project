package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.dao.BoardDAO;
import com.example.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	@Qualifier("boardDAO")
	private BoardDAO dao;
	
	//게시판 리스트
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

	@Override
	public void postWrite(BoardVO vo) throws Exception {
		dao.postWrite(vo);
	}

}
