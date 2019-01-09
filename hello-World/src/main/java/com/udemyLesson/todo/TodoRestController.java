package com.udemyLesson.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the class that will handle REST for the Todos.
 *
 */
@RestController
public class TodoRestController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(path="/todos")
	public List<Todo> retrieveAllTodos(){
		
		return service.retrieveTodos("in28Minutes"); //Hard coded!!
		
	}//End of the 'retrieveAllTodos' method

}//End of the 'TodoRestController' class
