<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>날짜</th>
		</tr>
		<c:forEach items="${list }" var="bean">
		<tr>
			<td><a href="${bean.num }">${bean.num }</a></td>
			<td><a href="${bean.num }">${bean.sub }</a></td>
			<td><a href="${bean.num }">${bean.nalja }</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>