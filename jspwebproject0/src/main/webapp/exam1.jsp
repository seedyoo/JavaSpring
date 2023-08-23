<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 테이블 (10행 1열) 홀수만 찍어보시오 -->
	
<%
	for(int i=1; i<=20; i++) {
		if(i%2==1) {
			out.println("<h2>" + i + "</h2>");	// <h2> 넣어서 글자 크기를 크게 
		}
	}
%>
</body>
</html>