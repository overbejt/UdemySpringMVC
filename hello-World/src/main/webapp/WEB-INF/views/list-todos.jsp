<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- For using the JSTL library -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Todo List!</title>
</head>
<body>

<table>
	<caption><h1>${name }'s Todo List:</h1></caption>
	<thead>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>Is Completed?</th>
		</tr>
	</thead>
	<tbody>
		<!-- Looping through the list  -->
		<!-- Same as: for(Todo todo: todos) -->
		<c:forEach items="${todos}" var="todo">
			<tr>	
				<td>${todo.desc}</td>
				<td>${todo.targetDate}</td>
				<!-- Java bean requires you to drop the 'is' -->
				<td>${todo.done}</td>
			</tr>
		</c:forEach>
		
	</tbody>
</table>


 <br/>
<a class="button" href="/add-todo">Add</a>
</body>
</html>