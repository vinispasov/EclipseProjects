import java.util.Scanner;

public class task10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size:");
	int size=sc.nextInt();
	int times=size/5;
	System.out.println(times+" times of 2 liters.");
	System.out.println(times+" times of 3 liters.");
	if (size%5==0) {
		
		System.out.println("No additional bucket.");
	}
	else if (size%5==1) {
		
		System.out.println("1 liter left to fill up the tank.");
	}
	else if (size%5==2) {
		
		System.out.println("Additional bucket of 2 liters.");
	}
	else if (size%5==3) {
		
		System.out.println("Additional bucket of 3 liters.");
	}
	else if (size%5==4) {
		
		System.out.println("Additional bucket of 3 liters and still 1 liter left to fill up the tank."
				+ "Or can use 2 buckets of 2 liters to fill up the tank.");
	}
}
}
