<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
<style>
	.gugutbl {
		width: 640px;
	}
	.gugutbl th, td{
		border: 1px solid blue;
		text-align: center;
	}
</style>
</head>
<body>
	<h2>구구단</h2>
	<table class="gugutbl">
		<tr>
		<%
			for(int c=2; c<=9; c++) {
				out.println("<th>" + c + "단</th>");
			}
		%>
		</tr>		
		
		<% 
		for(int r=1; r<=9; r++) {
			out.println("<tr>");
			for(int c=2; c<=9; c++) {
				out.println("<td>" + c + "*" + r + "=" + (c*r) + "</td>");
			}
			out.println("</tr>");	
		}
		%>

	</table>
</body>
</html>


















