<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="human.dao.FaqDao" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/mem_style.css">
</head>
<body>
	<!-- 1. hr2 계정에서 qna 테이블을 만든다
	2. 샘플 데이터를 3 개이상 넣는다
	3. jsp를 통해 목록을 출력 -->
	<h2 class="title">회원관리 및 목록</h2>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>문의내용</th>
			<th>답변내용</th>
			<th>ID</th>
		</tr>
	</table>
	<%
	FaqDao faqdao = new FaqDao();
	
		String Q = faqdao.getQseq();
		String S = faqdao.getSubject();
		String C = faqdao.getContent();
		String R = faqdao.getReply();
		String I = faqdao.getId();
		
		out.println("<tr>");
		out.println(Q);
		out.println("<td>" + S + "</td>");
		out.println("<td>" + C + "</td>");
		out.println("<td>" + R + "</td>");
		out.println("<td>" + I + "</td>");
		out.println("</tr>");
		
	%>
	
	
	
</body>
</html>