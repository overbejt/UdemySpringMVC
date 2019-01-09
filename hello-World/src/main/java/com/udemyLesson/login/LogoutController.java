package com.udemyLesson.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



/**
 * This is the class that will be the controller for the login page.  
 * @author joshoverbeck
 *
 */
@Controller
public class LogoutController {
		
	/**
	 * The requestMapping annotation calls this function when a user uses the /logout in the url bar.
	 * The ResponseBody annotation is letting me print directly into the body of the web page.  
	 * @return
	 */
	@RequestMapping(value="/logout", method= RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		
		//Terminate the authentication of the session
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(auth != null) {
			
			new SecurityContextLogoutHandler().logout(request, response, auth);
			
			//Being overly cautious about security
			request.getSession().invalidate();
		}
		
		
		
		//Send the user to the Welcome page
		return "redirect:/";
		
	}//end of the 'logout' method
	
	//Deleted the post method

}//End of the 'LogoutController' class
