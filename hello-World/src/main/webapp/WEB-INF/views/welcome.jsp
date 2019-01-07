<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome!</title>
	
	<!-- Nava bar -->
		<nav role="navigation" class="navbar navbar-default">
			<div >
				<a href="http://www.in28minutes.com" class="navbar-brand">in28Minutes</a>
			</div>
			<div class="navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/login">Home</a></li>
					<li><a href="/list-todos">Todos</a></li>
					<li><a href="/todo">Add/ update todo</a></li>
				</ul>
			</div>
		</nav><!-- End of the Nav bar -->
</head>
<body>
Welcome ${name }, to my odd-ball way of taking notes on a tutorial by using git to save each stage.

<br>
Now you can <a href="/list-todos" >manage your todos.</a>
</body>
</html>