package com.udemyLesson.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This is the class that will be the service for the todo package
 * @author joshoverbeck
 *
 */
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

}//End of the 'TodoService' class
