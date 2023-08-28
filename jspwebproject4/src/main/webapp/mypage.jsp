<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사용자 정보 확인 및 수정</h2>
	<%
		if(session.getAttribute("memid") == null) {	// 세션이 없음
			out.println("<script>alert('로그인 후 사용가능합니다');</script>");
			out.println("<script>location.href='login.jsp'</script>");
		}else {
			out.println("<h2>사용자 정보를 수정");
		}
	
	%>
</body>
</html>