package models;

import java.util.Date;
import java.text.SimpleDateFormat;
import models.base.Item;
import java.util.Calendar;
public class Task extends Item{
	
	//fields
	private String dueDate;
	private TaskPriority priority;
	private String plannedTime;
	private String assignee;
	
	//constructor
	public Task(String title, String description, String dueDate, TaskPriority priority, String plannedTime,
			String assignee) {
		super(title, description);
		this.dueDate = dueDate;
		this.priority = priority;
		this.plannedTime=plannedTime;
		setAssignee(assignee);
	}
	
	
	//getters and setters
	
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public TaskPriority getPriority() {
		return priority;
	}

	public void setPriority(TaskPriority priority) {
		this.priority = priority;
	}

	

	public String getPlannedTime() {
		return plannedTime;
	}


	public void setPlannedTime(String plannedTime) {
		this.plannedTime = plannedTime;
	}


	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		if (assignee==null||assignee.isEmpty()) {
			System.out.println("Incorect input.Try again.");
		}else {
			this.assignee = assignee;
		}
	}
	
	
	
	

}
