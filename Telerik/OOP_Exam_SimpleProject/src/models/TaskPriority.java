package models;

public enum TaskPriority {
	HIGH,LOW;
	
	public TaskPriority parseToPriority(String priorityString) {
		switch (priorityString) {
		case "high":
			return HIGH;
		case "low":
			return LOW;

		default:
			System.out.println("Incorrect input for priority.It can be only 'high' or 'low'.");
			break;
		}
		return null;
	}
}
