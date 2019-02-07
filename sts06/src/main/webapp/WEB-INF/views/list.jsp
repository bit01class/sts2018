<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/template/header.jspf" %>
</head>
<body>
<%@ include file="/template/menu.jspf" %>
	<div class="page-header">
	  <h1>게시판 <small>목록</small></h1>
	</div>
	<table class="table">
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="bean">
				<tr>
					<td><a href="./list/${bean.num }">${bean.num }</a></td>
					<td><a href="./list/${bean.num }">${bean.sub }</a></td>
					<td><a href="./list/${bean.num }">${bean.nalja }</a></td>
					<td><a href="./list/${bean.num }">${bean.cnt }</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
<%@ include file="/template/footer.jspf" %>
</body>
</html>












