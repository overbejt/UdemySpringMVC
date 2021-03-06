<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<!-- Including the Fragments for the header -->
		<%@ include file="common/header.jspf" %>	
		<!-- Including the Fragments for the nav bar -->
		<%@ include file="common/navigation.jspf" %>
	
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