package com.udemyLesson.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * This is the class that will be the service for the todo package
 * @author joshoverbeck
 *
 */
@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	//Random data provided by the class that I'm taking
	static {
		todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", new Date(),
				false));
		todos.add(new Todo(2, "in28Minutes", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "in28Minutes", "Learn Hibernate", new Date(),
				false));
	}
	
	//The addTodo method
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}//End of the 'addTodo' method
	
	//The 'deleteTodo' method
	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}//End of the 'deleteTodo' method
	
	//The 'retrieveTodos' method
	public List<Todo> retrieveTodos(String user) {
		//This is worth looking closer at.  I always have trouble with for each loops
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}//End of the 'retrieveTodos' method
	
	//The 'retrieveTodo' method
	public Todo retrieveTodo(int id) {
		for (Todo todo : todos) {
			if (todo.getId() == id)
				return todo;
		}
		return null;
	}//End of the 'retrieveTodo' method

	//The 'updateTodo' method
	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}//End of the 'updateTodo' method

}//End of the 'TodoService' class
