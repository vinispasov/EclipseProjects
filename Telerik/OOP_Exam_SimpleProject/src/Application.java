import base.CommandParser;
import java.util.Calendar;
import base.ProjectManagementSystem;
import commands.Command;
import commands.CommandType;
import models.Task;
import models.TaskPriority;
import models.Ticket;
import models.TicketPriority;
import models.Todo;
import models.TodoState;
import java.util.ArrayList;
import models.base.*;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
    private final CommandParser commandParser;
    ProjectManagementSystem system;

    public Application(CommandParser commandParser, ProjectManagementSystem system) {
        this.system = system;
        this.commandParser = commandParser;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("The availabele commands are: add_task, add_ticket, add_todo, update_todo, list_all, list_todos, list_todos_not_done, list_tickets, list_tasks, exit");
        System.out.println("After the command 'add_ticket', you should add 'title','description','due date','priority','sender', 'owner',all separeted with space.");
        System.out.println("After the command 'add_task', you should add 'title','description','due date','priority','planned date', 'assignee',all separeted with space.");
        System.out.println("After the command 'add_todo', you should add 'title','description','state',all separeted with space.");
        while (true) {
            String commandString = in.nextLine().toLowerCase();
            Command command = this.commandParser.parseCommand(commandString);
            if (command.getCommandType() == CommandType.EXIT) {
                break;
            }

            String title="";
            String description="";
            int counter=1;
            switch (command.getCommandType()) {
                case ADD_TODO:
                    title = command.getParams()[0];
                    description = command.getParams()[1];
                    TodoState state = TodoState.fromName(command.getParams()[2]);
                    system.addTodo(title, description, state);
                    break;
                case ADD_TASK:
                	 title = command.getParams()[0];
                     description = command.getParams()[1];
                     String dueDate=command.getParams()[2];
                     TaskPriority priorityTask=TaskPriority.LOW;
                     priorityTask=priorityTask.parseToPriority(command.getParams()[3]);
                     String plannedDate=command.getParams()[4];
                     String assignee=command.getParams()[5];
                     system.addTask(title, description, dueDate,priorityTask, plannedDate, assignee);
                    break;
                case ADD_TICKET:
                	title = command.getParams()[0];
                    description = command.getParams()[1];
                    String dueDateTicket=command.getParams()[2];
                    TicketPriority priorityTicket=TicketPriority.LOW;
                    priorityTicket=priorityTicket.parseToPriority(command.getParams()[3]);
                    String sender=command.getParams()[4];
                    String owner=command.getParams()[5];
                    system.addTicket(title, description, dueDateTicket,priorityTicket, owner, sender);
                    break;
                case LIST_ALL:
                    for (Item item : system.listAll()) {
                    	System.out.println("---------- item number "+counter+" ---------");
						System.out.println("title: "+item.getTitle());
						System.out.println("description: "+item.getDescription());
						System.out.println();
						counter++;
					}
                    counter=1;
                    break;
                case LIST_TASKS:
                    for (Task task : system.listTasks()) {
                    	System.out.println("---------- task number "+counter+" ---------");
						System.out.println("title: "+task.getTitle());
						System.out.println("description: "+task.getDescription());
						System.out.println("due date: "+task.getDueDate());
						System.out.println("priority: "+task.getPriority().toString());
						System.out.println("planned time: "+task.getPlannedTime());
						System.out.println("assignee: "+task.getAssignee());
						System.out.println();
						counter++;
					}
                    counter=1;
                    break;
                case LIST_TODOS:
                	  for (Todo todo : system.listTodos()) {
                      	System.out.println("---------- todo number "+counter+" ---------");
  						System.out.println("title: "+todo.getTitle());
  						System.out.println("description: "+todo.getDescription());
  						System.out.println("state: "+todo.getState().toString());
  						System.out.println();
  						counter++;
  					}
                      counter=1;
                    break;
                case UPDATE_TODO:
                    // TODO: your code here
                    break;
                case LIST_TICKETS:
                	for (Ticket ticket : system.listTickets()) {
                    	System.out.println("---------- ticket number "+counter+" ---------");
						System.out.println("title: "+ticket.getTitle());
						System.out.println("description: "+ticket.getDescription());
						System.out.println("due date: "+ticket.getDueDate());
						System.out.println("priority: "+ticket.getPriority().toString());
						System.out.println("sender: "+ticket.getSender());
						System.out.println("owner: "+ticket.getOwner());
						System.out.println();
						counter++;
					}
                    counter=1;
                    break;
                case LIST_TODOS_NOT_DONE:
                    // TODO: your code here
                    break;
            }
        }
    }
}
