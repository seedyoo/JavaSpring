<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>개인정보수정처리</h2>
	
	<%
		String myname = request.getParameter("pname");
		String myage = request.getParameter("page");
		out.println(myname + ", " + myage);
	%>
</body>
</html>