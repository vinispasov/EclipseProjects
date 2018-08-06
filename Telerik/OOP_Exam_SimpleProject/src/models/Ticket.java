package models;

import java.util.Date;
import models.base.Item;

public class Ticket extends Item{
	//fields
    private String dueDate;
    private TicketPriority priority;
    private String sender;
    private String owner;
    
    //constructor
	public Ticket(String title, String description, String dueDate, TicketPriority priority, String sender,
			String owner) {
		super(title, description);
		this.dueDate = dueDate;
		this.priority = priority;
		setSender(sender);
		setOwner(owner);
	}
	
	

	//getters and setters
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public TicketPriority getPriority() {
		return priority;
	}

	public void setPriority(TicketPriority priority) {
		this.priority = priority;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		if (sender.isEmpty()||sender==null) {
			System.out.println("The sender input is incorrect.Try again.");
		}else {
			this.sender = sender;
		}
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		if (owner.isEmpty()||owner==null) {
			System.out.println("The owner input is incorrect.Try again.");
		}else {
			this.owner = owner;
		}
	}
	
	
	
}
