package com.udemyLesson.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is the class that will be the controller for the login page.  
 * @author joshoverbeck
 *
 */
@Controller
public class LoginController {
	
	/**
	 * The requestMapping annotation calls this function when a user uses the /login in the url bar
	 * @return
	 */
	@RequestMapping(value="/login")
	public String sayHello() {
		return "Hello";
	}

}//End of the 'LoginController' class
