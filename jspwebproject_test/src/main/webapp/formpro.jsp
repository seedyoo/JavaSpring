<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>이름과 이메일을 받는 서버페이지</h2>
	<%
		String memname = request.getParameter("mname");
		out.println(memname);
		String mememail = request.getParameter("memail");
		out.println(mememail);
	%>
</body>
</html>