<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원입력값처리</h2>
	<% 
		String id = request.getParameter("mid");
		String pwd = request.getParameter("mpw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("cellphone");
		out.println(id+"<br>");
		out.println(pwd+"<br>");
		out.println(name+"<br>");
		out.println(email+"<br>");
		out.println(phone+"<br>");
	%>
	
</body>
</html>