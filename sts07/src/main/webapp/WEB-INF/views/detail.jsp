<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세페이지</h1>
	<form method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="hidden" name="num" value="${bean.num }">
		<div>
			<label for="sub">sub</label>
			<input type="text" name="sub" value="${bean.sub }" />
		</div>
		<div>
			<label for="content">content</label>
			<textarea name="content">${bean.content }</textarea>
		</div>
		<div>
			<button type="submit">수정</button>
			<button type="reset">취소</button>
		</div>
		
	</form>
	
	<form method="post">
			<input type="hidden" name="_method" value="DELETE"/>
			<button type="submit">삭제</button>
	</form>
</body>
</html>









