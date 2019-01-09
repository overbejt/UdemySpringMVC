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


		<table class="table table-striped">
			<!-- <caption><h1>${name }'s Todo List:</h1></caption> -->
			<!-- Internationalizing the caption -->
			<caption><spring:message code="todo.caption"/></caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Completed?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<!-- Looping through the list  -->
				<!-- Same as: for(Todo todo: todos) -->
				<c:forEach items="${todos}" var="todo">
					<tr>	
						<td>${todo.desc}</td>
						<!-- To format the date -->
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}"/></td>
						<!-- Java bean requires you to drop the 'is' -->
						<td>${todo.done}</td>
						<th><a href="/update-todo?id=${todo.id}" class="btn btn-warning">Update</a></th>
						<th><a href="/delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></th>
					</tr>
				</c:forEach> 
		
			</tbody>
		</table>


 		<br/>
 		<div>
			<a class="btn btn-success" href="/add-todo">Add</a>
		</div>
	</div><!-- End of the container div  -->
	
	<!-- Adding the fragment that will link to the javascript used for bootstrap -->
	<%@ include file="common/footer.jspf" %>
</body>
</html>