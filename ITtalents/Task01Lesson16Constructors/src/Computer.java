
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
	
	void comparePrice(double price) {
	   if (this.price>price) {
		System.out.println(-1);
		System.out.println(price+"price < "+this.price+" price");
	}
	   else if (this.price==price) {
		System.out.println(0);
		 System.out.println(price+"price = "+this.price+" price");
	}
	   else {
		   System.out.println(1);
		   System.out.println(price+" price > "+this.price+" price");
	   }
	}
	//Constructors
	
	Computer(){
		this.isNotebook=false;
		this.operationSystem="Win XP";
	}
	public Computer(int year, double price, int hardDiskMemory, int freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}
	public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory,
			String operationSystem) {
		
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}
	
	
	
	
}
