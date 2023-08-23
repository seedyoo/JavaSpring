<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>아이디 및 비밀번호</h2>
	
	<%
		String myid = request.getParameter("pid");
		String mypw = request.getParameter("ppw");
		out.println(myid + ", " + mypw);
	%>
</body>
</html>