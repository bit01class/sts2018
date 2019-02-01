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
			<h2>Login Page</h2>
		</div>
	</div>
	<div class="col-md-12">
		<form method="post">
			<div class="form-group">
				<label for="id">id</label>
				<input type="text" name="id" id="id"/>
			</div>
			<div class="form-group">
				<label for="pw">pw</label>
				<input type="text" name="pw" id="pw"/>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">로그인</button>
				<button type="reset" class="btn btn-default">취소</button>
				<button type="button" class="btn btn-default">회원가입</button>
			</div>			
		</form>
	</div>
<%@ include file="/template/footer.jspf" %>

</body>
</html>







