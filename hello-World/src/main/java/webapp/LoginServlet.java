package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	//creating an UserValidationService object instance
	private UserValidationService validator = new UserValidationService();

	/**
	 * This is the method that will handle the GET method
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//Paste this into browser in order to pass a parameter
		// http://localhost:8080/?name=Proper
		
		//To pass the parameter to the jsp
		request.setAttribute("name", request.getParameter("name"));
		
		//Paste this into browser in order to pass a parameter
		// http://localhost:8080/?name=Proper&password=oops
		request.setAttribute("password", request.getParameter("password"));
		//This is why GET can be a MAJOR security risk
		
		//I need to remember this line.  It is critical
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}//End of the 'doGet' method
	
	/**
	 * This is the method that will handle the POST method
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		
		//To pull the name entered in the form from the login page
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		
		//To pull the password in the form from the login page
		String password = request.getParameter("password");
		request.setAttribute("password", password);
		
		//Testing if the user is valid
		boolean isValid = validator.isUserValid(name, password);
		
		if(isValid) {
			//Send the user to welcom.jsp
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}else {
			//Send the user to login.jsp
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
		

	}//End of the 'doGet' method

}//End of the 'LoginServlet' class