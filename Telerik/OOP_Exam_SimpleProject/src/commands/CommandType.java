package commands;

public enum CommandType {
    ADD_TASK, ADD_TICKET, ADD_TODO, UPDATE_TODO, LIST_ALL, LIST_TODOS, LIST_TODOS_NOT_DONE, LIST_TICKETS, LIST_TASKS, EXIT,;

	public static CommandType fromName(String commandString) {
		switch (commandString) {
		case "add_task":return ADD_TASK;
		case "add_ticket":return ADD_TICKET;
		case "add_todo":return ADD_TODO;
		case "update_todo":return UPDATE_TODO;
		case "list_all":return LIST_ALL;
		case "list_todos":return LIST_TODOS;
		case "list_todos_not_done":return LIST_TODOS_NOT_DONE;
		case "list_tickets":return LIST_TICKETS;
		case "list_tasks":return LIST_TASKS;
		case "exit":return EXIT;
	
		default:
			System.out.println("Incorrect input");
			System.out.println("The available inputs are: add_task, add_ticket, add_todo, update_todo, list_all, list_todos, list_todos_not_done, list_tickets, list_tasks, exit");
			System.out.println("The application will automatically exit.");
			break;
		}
		return EXIT ;
	}
}
