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
			<h2>로그인 성공</h2>
		</div>
	</div>
	<div class="col-md-12">
		<h2 class="text-center">${bean.name }님 환영합니다</h2>
		<p class="text-center"><a href="logout">로그아웃</a></p>
	</div>
<%@ include file="/template/footer.jspf" %>

</body>
</html>




