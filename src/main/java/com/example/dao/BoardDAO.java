package com.example.dao;


import java.util.List;
import com.example.domain.BoardVO;

public interface BoardDAO {

	//게시물 리스트
	public List<BoardVO> list() throws Exception;
	
	//게시물 삽입
	public void postWrite(BoardVO vo) throws Exception;
	
	
	
}
