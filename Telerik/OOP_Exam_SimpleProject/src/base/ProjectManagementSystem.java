package base;

import models.Task;
import models.TaskPriority;
import models.Ticket;
import models.TicketPriority;
import models.Todo;
import models.TodoState;
import models.base.Item;

import java.util.Date;
import java.util.List;

public interface ProjectManagementSystem {

    void addTicket(String title, String description, String dueDate, TicketPriority priority, String sender, String owner);

    void addTodo(String title, String description, TodoState state);

    void addTask(String title, String description, String dueDate, TaskPriority priority, String plannedTime, String assignee);

    List<Item> listAll();

    List<Ticket> listTickets();

    List<Todo> listTodos();

    List<Item> listTodos(TodoState state);

    List<Task> listTasks();

    List<Item> searchByTitleOrDescription(String pattern);

    // TODO: fill your parameters here
    void changeTodoState();
}
