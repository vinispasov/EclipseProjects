package models;

import models.base.Item;

public class Todo extends Item{
	//fields
	private TodoState state;

	//costructor
	public Todo(String title, String description, TodoState state) {
		super(title, description);
		setState(state);
	}

	//getters and setters
	public TodoState getState() {
		return state;
	}

	public void setState(TodoState state) {
		this.state = state;
	}

}
