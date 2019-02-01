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
			<h2>입력페이지</h2>
		</div>	
	</div>
	<div class="col-md-12">
		<form method="post">
			<div class="form-group">
				<label for="sub">제목</label>
				<input type="text" name="sub" id="sub"/>
			</div>
			<div class="form-group">
				<label for="name">글쓴이</label>
				${sessionScope.login ne null?sessionScope.login.name:"비회원"}
				<input type="hidden" name="user_num" id="name" 
					value="${sessionScope.login ne null?sessionScope.login.user_num:0 }"/>
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea name="content"></textarea>
			</div>			
			<div class="form-group">
				<button type="submit">입력</button>
				<button type="reset">취소</button>
			</div>			
		</form>
	</div>
<%@ include file="/template/footer.jspf" %>
</body>
</html>












