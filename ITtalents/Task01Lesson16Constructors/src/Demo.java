
public class Demo {
	public static void main(String[] args) {
		Computer pc1=new Computer(2015,1000,500,450);
		Computer pc2=new Computer(2017,1300,true,1000,970,"Linux");
		
		pc1.comparePrice(pc2.price);
		
	}

}
