<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>성별 및 취미 입력 결과</h2>
	<%
		String gen = request.getParameter("gen");
		out.print(gen + "<br>");
		String[] hobby = request.getParameterValues("hob");
		for(int i=0; i<hobby.length; i++) {
			out.println(hobby[i]);
		}
	%>
</body>
</html>