<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<title>게시판 작성 페이지</title>
</head>
<body>
	<h1>BOARD WRITE</h1>
	
		<hr>
			<a href ="/">HOME</a>
			<a href ="/board/list">BOARD LIST</a>		
		<hr>
		
		<form method ="post" action ="write">
			<laber>작성자</laber>
			<input type="text"	id="writer" name="writer"/><br>
			<laber>제목</laber><br>
			<input type="text"	id="title" name="title"/><br>
			
			<laber>내용</laber><br>
			<textarea rows="10" cols="50" name="content"></textarea><br>
			
			<hr>
			<button type="submit">전송</button>			
		</form>

	
	
</body>
</html>
