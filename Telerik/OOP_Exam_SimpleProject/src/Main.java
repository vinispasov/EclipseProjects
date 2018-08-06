import base.CommandParser;
import base.ProjectManagementSystem;
import models.TicketPriority;
public class Main {
    public static void main(String[] args) {
        CommandParser parser = new CommandParserImpl();
        ProjectManagementSystem system = new ProjectManagementSystemImpl();
        Application app = new Application(parser, system);
        app.run();
        
    }
}