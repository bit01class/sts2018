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
			  <h1>목록 <small>리스트페이지</small></h1>
			</div>
		</div>
	</div>
	<div id="content" class="row">
		<div class="col-md-12">
			<table class="table">
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>글쓴이</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list }" var="bean">
						<tr>
							<td><a href="detail?idx=${bean.bbs_num }">${bean.bbs_num }</a></td>
							<td><a href="detail?idx=${bean.bbs_num }">${bean.sub }</a></td>
							<td><a href="detail?idx=${bean.bbs_num }">${bean.name }</a></td>
							<td><a href="detail?idx=${bean.bbs_num }">${bean.cnt }</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add" class="btn btn-default" role="button">입력</a>
		</div>
	</div>
<%@ include file="/template/footer.jspf" %>
</body>
</html>