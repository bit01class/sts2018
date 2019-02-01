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
	<div class="col-md-12">
		<div class="jumbotron">
			<h2>게시판</h2>
			<a href="add" role="button" class="btn btn-primary">입력</a>
		</div>
	</div>
	<div class="col-md-12">
		<table class="table">
			<thead>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>조회수</th>
				</tr>
			</thead>
			<c:forEach items="${list }" var="bean">
				<tbody>
					<tr>
						<td><a href="detail?idx=${bean.bbs_num }">${bean.bbs_num }</a></td>
						<td><a href="detail?idx=${bean.bbs_num }">${bean.sub }</a></td>
						<td><a href="detail?idx=${bean.bbs_num }">${bean.name }</a></td>
						<td><a href="detail?idx=${bean.bbs_num }">${bean.cnt }</a></td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
	</div>

<%@ include file="/template/footer.jspf" %>
</body>
</html>
<%
System.out.println("view...");
%>








