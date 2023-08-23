<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!-- import java.util.ArrayList -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	out.println("<h2>테스트 임포트</h2>");

	ArrayList arrlst = new ArrayList();
	arrlst.add("해바라기");
	arrlst.add("나팔꽃");
	
	out.println(arrlst.get(0));
%>


</body>
</html>