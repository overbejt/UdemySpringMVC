package com.udemyLesson.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemyLesson.login.LoginService;

/**
 * This is the class that will be the controller for the todo page.  
 * @author joshoverbeck
 *
 */
@Controller
public class TodoController {
	
	//Hard coding in a user name, because, why not
	String user = "in28Minutes";
	
	//Creating an instance of the TodoService class using dependency injection and Autowire
	@Autowired
	TodoService service;
	
	/**
	 * The requestMapping annotation calls this function when a user uses the /login in the url bar.
	 * The ResponseBody annotation is letting me print directly into the body of the web page.  
	 * @return
	 */
	@RequestMapping(value="/list-todos", method= RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.addAttribute("todos", service.retrieveTodos(user));
		return "list-todos";
	}//end of the 'showLoginPage' method

}//End of the 'LoginController' class
