<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>톰캣과 오라클 연동테스트2</h2>
	<%
		// 1. 오라클 새로운 계정을 만든다 id: hr2, pw: 123456
		// 2. 오라클 접속을 테스트 하시오
		String userid = "hr2";
		String userpw = "123456";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			out.println("1_드라이버로딩 성공");			
			DriverManager.getConnection(url, userid, userpw);
			out.println("2_접속성공");
		} 
		catch (Exception e) {
			out.println("1,2_접속실패: " + e.getMessage());
		}
	%>
</body>
</html>