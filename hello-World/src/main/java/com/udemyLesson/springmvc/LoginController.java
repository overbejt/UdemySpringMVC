package com.udemyLesson.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This is the class that will be the controller for the login page.  
 * @author joshoverbeck
 *
 */
@Controller
public class LoginController {
	
	/**
	 * The requestMapping annotation calls this function when a user uses the /login in the url bar.
	 * The ResponseBody annotation is letting me print directly into the body of the web page.  
	 * @return
	 */
	@RequestMapping(value="/login")
	public String sayHello() {
		return "login";
	}

}//End of the 'LoginController' class