package com.udemyLesson.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.udemyLesson.login.LoginService;

/**
 * This is the class that will be the controller for the todo page.  
 * @author joshoverbeck
 *
 */
@Controller
@SessionAttributes("name")
public class TodoController {
	
	//Hard coding in a user name, because, why not
	String user = "in28Minutes";
	
	//Creating an instance of the TodoService class using dependency injection and Autowire
	@Autowired
	TodoService service;
	
	/**
	 * The requestMapping annotation calls this function when a user logs in.
	 * The ResponseBody annotation is letting me print directly into the body of the web page.  
	 * @return
	 */
	@RequestMapping(value="/list-todos", method= RequestMethod.GET)
	public String listTodos(ModelMap model) {
		model.addAttribute("todos", service.retrieveTodos(user));
		return "list-todos";
	}//end of the 'showLoginPage' method
	
	/**
	 * This is the method that will allow the user to be redirected to a page for adding todos.
	 * @return
	 */
	@RequestMapping(value="/add-todo", method= RequestMethod.GET)
	public String showTodoPage() {
		return "todo";
	}//end of the 'showLoginPage' method

}//End of the 'LoginController' class
