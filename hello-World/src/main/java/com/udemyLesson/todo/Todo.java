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
	
	//Overriding the toString method
	//Used the String.format!!
	@Override
	public String toString() {
		return String.format("altered-toString: Todo [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id, user, desc, targetDate,
				isDone);
	}//End of the 'toString' method
	
	////////////////// Overriding the equals method ////////////////////
	//Using only the id variable!
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}
//////////////////End of Overriding the equals method ////////////////////
	

}//End of the 'Todo' class
