package com.example.domain;

public class BoardVO {

	/*
	 * CREATE TABLE tbl_board ( 
	 * 			bno 			NUMBER 				NOT NULL, 
	 * 			title 			VARCHAR2(50) 		NOT NULL,
	 * 			content 		CLOB, 	
	 * 			writer 			VARCHAR2(30) NOT NULL, 
	 * 			regDate 		DATE 				DEFAULT SYSDATE,
	 * 
	 * 			PRIMARY KEY (bno) );
	 */
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private String regDate;
	
	//alt+shft+s
	//getter setter -> 캡슐화 (외부로부터 접근을 막고 안전하게 값을 주고 받기 위함)
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
	//기본생성자 constructor
	public BoardVO() {
		
	}

	
	//매개변수 생성자
	public BoardVO(int bno, String title, String content, String writer, String regDate) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
	}

	//toString
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDate="
				+ regDate + "]";
	}
	

	
}
