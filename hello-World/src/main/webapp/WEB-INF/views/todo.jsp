<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- for validation -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- Adding bootstrap css  -->
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<title>Todo List!</title>
	
	<!-- Nava bar -->
		<nav role="navigation" class="navbar navbar-default">
			<div >
				<a href="http://www.in28minutes.com" class="navbar-brand">in28Minutes</a>
			</div>
			<div class="navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="/login">Home</a></li>
					<li><a href="/list-todos">Todos</a></li>
					<li class="active"><a href="/todo">Add/ update todo</a></li>
				</ul>
			</div>
		</nav><!-- End of the Nav bar -->
	
</head>
<body>
	<div class="container">
		<h1>Add a Todo</h1>
		<!-- Renders an HTML form tag and exposes a binding path to inner tags for binding  -->
		<form:form method="post" commandName="todo">
			
			<form:hidden path="id"/><!-- So that the todo id can be used when updating a todo -->
			<form:hidden path="user"/><!-- So that the user name can be used when updating a todo -->
			
			<fieldset class="form-group">
				<form:label path="desc">Description</form:label>
				<form:input path="desc" class="form-controll" required="required" type="text"/>
				<form:errors path="desc" cssClass="text-warning"/>
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="targetDate">Target Date</form:label>
				<form:input path="targetDate" class="form-controll" required="required" type="text"/>
				<form:errors path="targetDate" cssClass="text-warning"/>
			</fieldset>
			
			<input type="submit" class="btn btn-success" value="Submit"/>
		</form:form>
	</div><!-- End of the 'container' div -->

<!-- Adding the two javascript links for bootstrap -->
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>