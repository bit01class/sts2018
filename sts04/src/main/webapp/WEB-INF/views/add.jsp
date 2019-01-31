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
	<div class="row">
		<div class="col-md-12">
			<div class="page-header">
			  <h1>INSERT <small>입력페이지</small></h1>
			</div>
		</div>
	</div>
	<div id="content" class="row">
		<div class="col-md-12">
			<form action="insert" method="post">
				<input type="hidden" name="user_num" value="0">
				<div class="form-group">
					<label for="sub"></label>
					<input type="text" name="sub" id="sub"/>
				</div>
				<div class="form-group">
					<label for="content"></label>
					<textarea name="content" id="content"></textarea>
				</div>
				<button>입력</button>
			</form>		
		</div>
	</div>
<%@ include file="/template/footer.jspf" %>
</body>
</html>








