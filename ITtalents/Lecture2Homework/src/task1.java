import java.util.Scanner;
public class task1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number a:");
	double a=sc.nextDouble();
	System.out.println("Enter number b:");
	double b=sc.nextDouble();
	System.out.println("Enter number c:");
	double c=sc.nextDouble();
	if (c>a&&c<b) {
		System.out.println("The number is beetween "+a+" and "+b);
	}
	else {
		System.out.println("Number out of Range!");
	}
	

}
}
