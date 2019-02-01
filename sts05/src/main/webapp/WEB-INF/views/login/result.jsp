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
			<h2>회원가입 되었습니다</h2>
		</div>
	</div>
	<div class="col-md-12">
		<div class="panel panel-primary">
		  <div class="panel-heading">
		    <h3 class="panel-title">가입내용 확인</h3>
		  </div>
		  <div class="panel-body">
		    	<p class="text-center">id:${bean.id }</p>
		    	<p class="text-center">name:${bean.name }</p>
		  </div>
		</div>
	</div>
<%@ include file="/template/footer.jspf" %>
</body>
</html>







