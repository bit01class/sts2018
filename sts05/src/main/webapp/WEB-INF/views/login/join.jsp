<%@page import="org.springframework.validation.BeanPropertyBindingResult"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/template/header.jspf" %>
<style type="text/css">
	.err{
		color: red;
		font-style: italic;
	}
</style>
</head>
<body>
<%@ include file="/template/menu.jspf" %>
	<div class="col-md-12">
		<div class="jumbotron">
			<h2>회원가입</h2>
		</div>		
	</div>
	<div class="col-md-12">
		<form method="post">
			<div class="form-gourp">
				<label for="name">이름</label>
				<input type="text" name="name" id="name"/><span class="err">${err.name }</span>
			</div>
			<div class="form-gourp">
				<label for="id">아이디</label>
				<input type="text" name="id" id="id"/><span class="err">${err.id }</span>
			</div>
			<div class="form-gourp">
				<label for="pw">비밀번호</label>
				<input type="text" name="pw" id="pw"/><span class="err">${err.pw }</span>
			</div>
			<div class="form-gourp">
				<label for="re"></label>
				<input type="text" id="re"/>
			</div>
			<div class="form-gourp">
				<button type="submit">회원가입</button>
				<button type="reset">취소</button>
			</div>
		</form>
	</div>
<%@ include file="/template/footer.jspf" %>

</body>
</html>







