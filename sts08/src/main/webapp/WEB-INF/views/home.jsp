<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function(){
		getlist();
		$('#addbtn').click(function(){
			var param=$('#myModal form').serialize();
			//alert(param);
			$.post('/sts08/bbs',param,function(data){
				$('#myModal').modal('hide');
				getlist();
			});
		});
		
	});
	
	function getlist(){
		$.get('/sts08/bbs',function(data){
			var msg='';
			$.each(data,function(){
				msg+='<tr><td>'+this.num
				+'</td><td>'+this.sub
				+'</td><td>'+this.content+'</td></tr>';
			});
			$('#content tbody').html(msg);
		});
		
	}
	
</script>

</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
		
		</div>
	</div>
	<div id="content" class="row">
		<div class="col-md-12">
		<h1>
			Hello world!  
		</h1>
		
		<table>
			<thead>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>날짜</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  입력
</button>
		</div>
	</div>
	<div id="footer" class="row">
		<div class="col-md-12"></div>
	</div>
</div>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">입력페이지</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label for="sub" class="col-sm-2 control-label">sub</label>
		    <div class="col-sm-10">
		      <input type="email" name="sub" class="form-control" id="sub" placeholder="제목">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="content" class="col-sm-2 control-label">content</label>
		    <div class="col-sm-10">
		      <textarea name="content"></textarea>
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" id="addbtn" class="btn btn-primary">입력</button>
      </div>
    </div>
  </div>
</div>



</body>
</html>








