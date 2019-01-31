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
			  <h1>DETAIL <small>글번호${bean.bbs_num }번 상세페이지</small></h1>
			</div>
		</div>
	</div>
	<div id="content" class="row">
		<div class="col-md-12">
			<form>
				<input type="hidden" name="bbs_num" value="${bean.bbs_num }">
				<input type="hidden" name="user_num" value="${bean.user_num }">
				<div class="form-group">
					<label for="sub">제목</label>
					<input type="text" name="sub" id="sub" value="${bean.sub }"/>
				</div>
				<div class="form-group">
					<label for="name">작성자</label>
					<input type="text" name="name" id="name" value="${bean.name }"/>
				</div>
				<div class="form-group">
					<label for="content">내용</label>
					<textarea name="content" id="content">${bean.content }</textarea>
				</div>
			</form>		
		</div>
	</div>
<%@ include file="/template/footer.jspf" %>
</body>
</html>








