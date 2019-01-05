package com.udemyLesson.todo;

import java.util.Date;

/**
 * This is the class that will serve as the todo objects.
 * @author joshoverbeck
 *
 */
public class Todo {
	
	//Instance variables
	private int id;
	private String user;
	private String desc;
	private Date targetDate;
	private boolean isDone;
	
	///////////// Getters and setters ////////////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	////////// End of Getters and Setters ///////////////////
	

}//End of the 'Todo' class
