public class Computer {
	
	//state
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	//behavior
	
	void changeOperationSystem(String operationSystem) {
		
		this.operationSystem=operationSystem;	
	}
	void useMemory(int memory) {
	   if (memory>=freeMemory) {
		System.out.println("Not enough free memory!");
	   }
	   else {
		freeMemory-=memory;
		System.out.println("Free memory: "+freeMemory);
	   }
	}
	
}


