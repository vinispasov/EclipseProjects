package homework2Lesson16Encapsulation;

public class Warehouse {
	public static void main(String[] args) {
		Employee pesho=new Employee("Pesho");
		Employee niki=new Employee("Niki");
		pesho.setHoursLeft(2);
		Task peshoTask=new Task("Pochistvane",5);
		pesho.setCurrentTask(peshoTask);
		pesho.work(pesho.getCurrentTask());
		pesho.showReport();
		
		
		niki.setHoursLeft(6);
		Task nikiTask=new Task("Podrejdane",4);
		niki.setCurrentTask(nikiTask);
		niki.work(niki.getCurrentTask());
		niki.showReport();
		
	}

}
