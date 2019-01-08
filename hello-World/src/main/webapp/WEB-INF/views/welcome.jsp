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
			Welcome ${name }, to my odd-ball way of taking notes on a tutorial by using git to save each stage.

			<br>
			Now you can <a href="/list-todos" >manage your todos.</a>

			<!-- Adding the fragment that will link to the javascript used for bootstrap -->
			<%@ include file="common/footer.jspf" %>
			
		</div><!-- End of the 'container' -->
	</body>
</html>