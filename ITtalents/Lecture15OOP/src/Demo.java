
public class Demo {
	public static void main(String[] args) {
		Computer pc1=new Computer();
		pc1.year=2010;
		pc1.price=575.50;
		pc1.operationSystem="Windows";
		pc1.isNotebook=false;
		pc1.hardDiskMemory=500;
		pc1.freeMemory=450;
		
		Computer pc2=new Computer();
		pc2.year=2017;
		pc2.price=1300;
		pc2.operationSystem="Windows";
		pc2.isNotebook=true;
		pc2.hardDiskMemory=1000;
		pc2.freeMemory=700;
		//before method
		System.out.println("Before the method:");
		System.out.println("PC 1:");
		System.out.println("Year of producing: "+pc1.year);
		System.out.println("Price in leva: "+pc1.price);
		System.out.println("Operation System: "+pc1.operationSystem);
		System.out.println("Hard disk memory: "+pc1.hardDiskMemory);
		System.out.println("Free memory: "+pc1.freeMemory);
		if (pc1.isNotebook==true) {
			System.out.println("Notebook");
		}
		else {
			System.out.println("Computer");
		}
		System.out.println();
		System.out.println("PC 2:");
		System.out.println("Year of producing: "+pc2.year);
		System.out.println("Price in leva: "+pc2.price);
		System.out.println("Operation System: "+pc2.operationSystem);
		System.out.println("Hard disk memory: "+pc2.hardDiskMemory);
		System.out.println("Free memory: "+pc2.freeMemory);
		if (pc2.isNotebook==true) {
			System.out.println("Notebook");
		}
		else {
			System.out.println("Computer");
		}
		
		pc1.useMemory(100);
		pc2.changeOperationSystem("Linux");
		//after method
		System.out.println("After the method:");
		System.out.println();
		System.out.println("PC 1:");
		System.out.println("Year of producing: "+pc1.year);
		System.out.println("Price in leva: "+pc1.price);
		System.out.println("Operation System: "+pc1.operationSystem);
		System.out.println("Hard disk memory: "+pc1.hardDiskMemory);
		System.out.println("Free memory: "+pc1.freeMemory);
		if (pc1.isNotebook==true) {
			System.out.println("Notebook");
		}
		else {
			System.out.println("Computer");
		}
		System.out.println();
		System.out.println("PC 2:");
		System.out.println("Year of producing: "+pc2.year);
		System.out.println("Price in leva: "+pc2.price);
		System.out.println("Operation System: "+pc2.operationSystem);
		System.out.println("Hard disk memory: "+pc2.hardDiskMemory);
		System.out.println("Free memory: "+pc2.freeMemory);
		if (pc2.isNotebook==true) {
			System.out.println("Notebook");
		}
		else {
			System.out.println("Computer");
		}
		
	}
}
