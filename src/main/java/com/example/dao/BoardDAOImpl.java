package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sql;	
	private static String namespase = "com.example.dao.BoardDAO";
	
	//게시판 리스트
	@Override
	public List<BoardVO> list() throws Exception {
		
		return sql.selectList(namespase+".list");
	}
		
	//게시판 삽입
	@Override
	public void postWrite(BoardVO vo) throws Exception {
		sql.insert(namespase+".write",vo);
		
	}
	
}
