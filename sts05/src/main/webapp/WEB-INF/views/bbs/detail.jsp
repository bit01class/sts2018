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
			<h2>상세페이지</h2>
		</div>
	</div>
	<div class="col-md-2">글번호</div>
	<div class="col-md-2">${bean.bbs_num }</div>
	<div class="col-md-2">글쓴이</div>
	<div class="col-md-2">${bean.name }</div>
	<div class="col-md-2">조회수</div>
	<div class="col-md-2">${bean.cnt }</div>
	<div class="col-md-6">제목</div>
	<div class="col-md-6">${bean.sub }</div>
	<div class="col-md-6"></div>
	<div class="col-md-6">${bean.content }</div>
	<div class="col-md-12">
		<a href="edit" role="button" class="btn btn-default">수정</a>
		<a href="edit" role="button" class="btn btn-default">삭제</a>
	</div>
<%@ include file="/template/footer.jspf" %>
</body>
</html>














