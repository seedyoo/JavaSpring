<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int add(int x, int y) {
			return x*y;
		}
	%>
	
	<%
		int x = 10;
		int result = add(x, 10);
	%>
	
	<h1>총인원수: <%= result %></h1>
</body>
</html>