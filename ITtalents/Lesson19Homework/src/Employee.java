
public class Employee {
	private String name;
	private Task currentTask;
	private static final int MAX_HOURS=8;
	private int hoursLeft=MAX_HOURS;
	private int days=1;
	static AllWork allWork;
    
	//constructor
	Employee(String name){
		setName(name);
	}
	
	//setters
	
	public void setName(String name) {
		if (name!=" ") {
			this.name=name;
		}
		else {
			System.out.println("The name is incorrect!");
		}
	}
	public void setCurrentTask(Task currentTask) {
	     this.currentTask=currentTask;
	}
	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft>=0) {
			this.hoursLeft=hoursLeft;
		}
		else {
			System.out.println("Incorrect number for hours left!");
		}	
	}
	
	//getters
	
	public String getName() {
		return this.name;
	}
	public Task getCurrentTask() {
		return this.currentTask;
	}
	public int getHoursLeft() {
		return this.hoursLeft;
	}
	
	//methods
	
	void work(AllWork allWork) {
		
			while(this.hoursLeft>0) {
				int workingHours=allWork.getCurrentTask().getWorkingHours();
			if (workingHours>this.hoursLeft) {
				allWork.getCurrentTask().setWorkingHours(workingHours-this.hoursLeft);
				this.hoursLeft=0;
				System.out.println(this.getName()+" is getting next task - "
				+allWork.getCurrentTask().getName()+",but it is time to go home now.Hours left to finish the last task: "+allWork.getCurrentTask().getWorkingHours());
			}
			else if (this.hoursLeft>workingHours) {
				System.out.println(this.getName()+" is getting new task -"
				+allWork.getCurrentTask().getName()+" for "+allWork.getCurrentTask().getWorkingHours()+" hours.");
				this.hoursLeft-=workingHours;
				allWork.getCurrentTask().setWorkingHours(0);
				if (allWork.getMAX_FREE_PLACES()-1==allWork.getCurrentUnassignedTask()) {
					System.out.println("No more tasks to do for "+this.getName()+".");
					System.out.println(this.getName()+"'s hours left to go home: "+this.hoursLeft);
					break;
				}
			    allWork.getNextTask();
			}
			else {
				allWork.getCurrentTask().setWorkingHours(0);
				this.hoursLeft=0;
				System.out.println(this.getName()+" finish for today!He done all day "+allWork.getCurrentTask().getName()+".");
				allWork.getNextTask();
			}
			}
	}
	
	public void showReport() {
		System.out.println();
		System.out.println("Name of employee: "+getName());
		System.out.println("Current task name: "+ this.currentTask.getName());
		System.out.println("Hours left to work: "+getHoursLeft());
		System.out.println("Hours left for the task: "+this.currentTask.getWorkingHours());
	}
	
	void startWorkingDay() {
		this.hoursLeft=MAX_HOURS;
		System.out.println("It's a day "+(this.days++)+" for "+this.getName()+"." );
	}
	

	
}
