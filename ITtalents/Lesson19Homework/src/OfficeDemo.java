
public class OfficeDemo {
	public static void main(String[] args) {
		
		AllWork allWork=new AllWork();
		
		Employee pesho=new Employee("Pesho");
		Employee gosho=new Employee("Gosho");
		
		Task t1=new Task("Cleaning",8);
		Task t2=new Task("get stuffs in order",1);
		Task t3=new Task("Writing",8);
		Task t4=new Task("Post",8);
		Task t5=new Task("filling in a documents",2);
		Task t6=new Task("Acepting calls",8);
		Task t7=new Task("Writing",8);
		Task t8=new Task("Post",4);
		Task t9=new Task("Cleaning",7);
		Task t10=new Task("get stuffs in order",8);
		
		allWork.addTask(t1);
		allWork.addTask(t2);
		allWork.addTask(t3);
		allWork.addTask(t4);
		allWork.addTask(t5);
		allWork.addTask(t6);
		allWork.addTask(t7);
		allWork.addTask(t8);
		allWork.addTask(t9);
		allWork.addTask(t10);
		
		while(true) {
			pesho.startWorkingDay();
			gosho.startWorkingDay();
			pesho.work(allWork);
			gosho.work(allWork);
		
			if (allWork.isAllWorkDone()==true) {
				System.out.println("All work is done finally!");
				break;
			}
		}
		
	}

}
