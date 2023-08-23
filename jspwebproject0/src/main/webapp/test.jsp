<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp 코드는 상단에 파일의 특성을 나타내는 내용 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String name = "자바개발자";
	out.println("당신의 이름은: " + name);
	out.println("<h2>블로그입니다</h2>");
%>

</body>
</html>