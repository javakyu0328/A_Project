<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>게시판 작성 페이지</title>
</head>
<body>
	<h1>BOARD LIST</h1>
	
		<hr>
			<a href ="/">HOME</a>
			<a href ="/board/write">BOARD WRITE</a>		
		<hr>
		
		<table>
			 	<thead>
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>내용</th>
						<th>작성일</th>
					</tr> 	
			 	</thead>
			 	
			 	<tbody>
			 		<c:forEach items="${list}" var="list">
			 			<tr>	
				 			<td>${list.bno}</td>
				 			<td>${list.title}</td>
				 			<td>${list.writer}</td>
				 			<td>${list.content}</td>
				 			<td>${list.regDate}</td>
				 		</tr>	
			 		</c:forEach>
			 	
			 	</tbody>
			 	
		</table>

	
	
</body>
</html>
