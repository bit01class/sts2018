<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	파일업로드
</h1>

	<form action="upload" method="post" enctype="multipart/form-data">
		id<input type="text" name="id"/><br/>
		file<input type="file" name="file1" /><br/>
		<button type="submit">전송</button>
	</form>

</body>
</html>
