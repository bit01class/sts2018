<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/template/header.jspf" %>
<script type="text/javascript">
	$(function(){
		$("#btns").hide();
		$(".form-group>input,.form-group>textarea").hide();
		$("#edit").click(function(){
			$("#btns").show();
			$(".form-group>input,.form-group>textarea").show();
			$("#title").text("수정");
			$(".detail").hide();
		});
	});

</script>
</head>
<body>
<%@ include file="/template/menu.jspf" %>
	<div class="page-header">
	  <h1><span id="title">상세</span>페이지 <small>${bean.num }번째 글</small></h1>
	</div>
	<form method="post">
		<input type="hidden" name="_method" value="PUT">
		<div class="form-group">
			<span>글번호</span>
			<span>${bean.num }</span>
			<input type="hidden" name="num" value="${bean.num }" />
			<span>날짜</span>
			<span>${bean.nalja }</span>
			<span>수정횟수</span>
			<span>${bean.cnt }</span>
		</div>
		<div class="form-group">
			<span>제목</span>
			<span class="detail">${bean.sub }</span>
			<input type="text" name="sub" value="${bean.sub }"/>
		</div>
		<div class="form-group">
			<div class="detail">${bean.content }</div>
			<textarea name="content">${bean.content }</textarea>
		</div>
		<div class="form-group" id="btns">
			<button type="submit">수정</button>
			<button type="reset">취소</button>
		</div>
	</form>
	<div class="detail">
		<button id="edit" class="btn btn-default">수정</button>
		<button id='del' class="btn btn-danger">삭제</button>
	</div>
<%@ include file="/template/footer.jspf" %>
</body>
</html>







