
public class AllWork {
	private Task[] tasks;
	private static final int MAX_FREE_PLACES=10;
	private int freePlacesForTasks;
	private static int currentUnassignedTask;
	private int addTaskIdx=0;
	//constructor
	public AllWork() {
		this.tasks=new Task[MAX_FREE_PLACES];
		this.freePlacesForTasks =MAX_FREE_PLACES;
		currentUnassignedTask =0;
	}
	
	//methods
	
	void addTask(Task task) {
		if (this.freePlacesForTasks<=0) {
			System.out.println("The list is full with tasks!You can put only "+MAX_FREE_PLACES+" tasks!");
		}
		else {
		this.tasks[this.addTaskIdx]=task;
		this.addTaskIdx++;
		this.freePlacesForTasks--;
		}
	}

	Task getCurrentTask() {
		return this.tasks[currentUnassignedTask];
	}
	void getNextTask() {
		++currentUnassignedTask;
	}

	boolean isAllWorkDone() {
		boolean isDone=false;
		for (int i = 0; i < tasks.length; i++) {
		   if (this.tasks[i].getWorkingHours()>0) {
			  
			   isDone=false;
			   break;
		    }
		   else {  
			   isDone=true;
		    }
		}
		
		if (isDone) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//getters
	int getMAX_FREE_PLACES() {
		return MAX_FREE_PLACES;
	}
	int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}

}
