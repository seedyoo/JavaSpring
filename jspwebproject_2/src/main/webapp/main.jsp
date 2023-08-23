<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.wrapper { width: 960px; }
	header {
		background-color: lightblue;
	}
	.menu {
		width: 800px;
		overflow: auto;
	}
	.menu li {
		width: 150px;
		float: left;
		list-style-type: none;
		background-color: lightgray;
		margin-left: 5px;
	}
	.maincontent {
		clear: both;
		height: 400px;
		background-color: brown;
	}
	
	footer {
		background-color: darkgreen;
	}
</style>
</head>
<body>

	<div class="wrapper">
		
		<jsp:include page="common_head.jsp" />
		
		<div class="maincontent">
		
			<h1>한국 천문대입니다 즐거운 시간되길...</h1>
			
			<p>무더운 여름에 시원한 관람되세요^^</p>
			
		</div>
		
		<footer>
			<h3>한국천문대입니다</h3>
			<address>경기도 포천</address>
		</footer>
		
	</div>

</body>
</html>




























