<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	// 일반 자바 코드와 동일함
	// 1~100까지 중에 짝수 출력하시오
	for(int i=1; i<=100; i++) {
		if(i%2==0) {
			out.println("<h2>" + i + "</h2>");	// <h2> 넣어서 글자 크기를 크게 
		}
	}
%>

</body>
</html>