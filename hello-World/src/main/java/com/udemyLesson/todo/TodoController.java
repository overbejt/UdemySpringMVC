package com.udemyLesson.todo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.udemyLesson.exception.ExceptionController;



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
	
	//Created a log object from the apache commons library
	private Log log = LogFactory.getLog(ExceptionController.class);
	
	//Creating an instance of the TodoService class using dependency injection and Autowire
	@Autowired
	TodoService service;
	
	/**
	 * Using a Web Data Binder to specify a date format for the entire application
	 * @param binder
	 */
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		//Creating a date format object
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		//Binding the date format
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
		
	}//End of the 'initBinder' method
	
	/**
	 * The requestMapping annotation calls this function when a user logs in.
	 * The ResponseBody annotation is letting me print directly into the body of the web page.  
	 * @return
	 */
	@RequestMapping(value="/list-todos", method= RequestMethod.GET)
	public String listTodos(ModelMap model) {
		model.addAttribute("todos", service.retrieveTodos(retrieveLoggedinUserName()));
		return "list-todos";
	}//end of the 'listTodos' method

	/**
	 * Using Spring security to capture the user's credentials
	 * 
	 * @return
	 */
	private String retrieveLoggedinUserName() {
		//Creating a principal object
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		//Test if the user name is valid
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		
		return principal.toString();
		
	}//End of the 'retrieveLoggedinUserName' method
	
	/**
	 * This is the method that will allow the user to be redirected to a page for adding todos.
	 * @return
	 */
	@RequestMapping(value="/add-todo", method= RequestMethod.GET)
	public String showTodoPage(ModelMap model) {
		//Just to show that the error page and exception handling is working
		throw new RuntimeException("Bogus Exception");
		
		/*
		//Making the Todo command bean available 
		model.addAttribute("todo", new Todo(0, retrieveLoggedinUserName(), "", new Date(), false));
		return "todo";
		*/
	}//end of the 'showTodoPage' method
	
	/**
	 * This is the method that will handle a user adding a todo to the list.
	 * The Valid annotation uses the Hibernate validator.  The BindingResult 
	 * is where the results from the Hibernate validator will be.  
	 * @return
	 */
	@RequestMapping(value="/add-todo", method= RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		
		//Checking if there are any validation errors
		if(result.hasErrors()) {
			return "todo";
		}
		
		//Adding the new todo
		service.addTodo("in28Minutes", todo.getDesc(), new Date(), false);
		
		//Clearing the model map so that parameters are not passed through the url
		model.clear();
		
		return "redirect:list-todos";
	}//end of the 'addTodo' method
	
	/**
	 * This is the method that will handle deleting a todo. It will delete the 
	 * Todo from the list.  Then it will clear the model map so that the user name 
	 * won't be passed through the url.
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/delete-todo", method= RequestMethod.GET)
	public String deleteTodo(ModelMap model, @RequestParam int id) {
		//Delete the todo
		service.deleteTodo(id);
		//Clearing the model map so that parameters are not passed through the url
		model.clear();
		
		return "redirect:list-todos";
	}//end of the 'addTodo' method
	
	/**
	 * This is the method that will handle updating a todo Get method
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/update-todo", method= RequestMethod.GET)
	public String updateTodo(ModelMap model, @RequestParam int id) {
		//Get the todo
		Todo todo = service.retrieveTodo(id);
		//putting the todo in the model map so that it'll show up on the screen
		model.addAttribute("todo", todo);
		
		return "todo";
	}//end of the 'updateTodo' method
	
	/**
	 * This is the method that will update a todo using the post method.  It
	 * is not implemented yet.
	 * 
	 * @return
	 */
	@RequestMapping(value="/update-todo", method= RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		//Checking if there are any validation errors
		if(result.hasErrors()) {
			return "todo";
		}
		
		todo.setUser(retrieveLoggedinUserName());//Hard coded!!
		
		//Updating the todo
		service.updateTodo(todo);
		
		//redirect the user to the list-todos page
		return "redirect:list-todos";
	}//end of the 'updateTodo' method
	
	/**
	 * This is an example of local exception handling
	 * 
	 * @param request
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(value=Exception.class)
	public String handleException(HttpServletRequest request, Exception ex) {
		
		//Logging the exception
		log.error("Request " + request.getRequestURI() + " threw an exception.", ex);
		
		//Send the user to the error page
		return "error-specific";
		
	}//End of the 'handleException' method

}//End of the 'LoginController' class
