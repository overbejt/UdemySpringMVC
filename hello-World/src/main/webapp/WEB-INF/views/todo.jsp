<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Adding bootstrap css  -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Todo List!</title>
</head>
<body>
	<div class="container">
		<h1>Add a Todo</h1>
		<form method="post">
			<fieldset class="form-group">
				<label>Description</label>
				<input name="desc" class="form-controll" required="required" type="text"/>
			</fieldset>
			<input type="submit" class="btn btn-success" value="Add"/>
		</form>
	</div><!-- End of the 'container' div -->

<!-- Adding the two javascript links for bootstrap -->
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>