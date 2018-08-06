import java.util.Scanner;
public class task06 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int number=sc.nextInt();
	int counter=0;
	for (int i =1; i <=number; i++) {
		counter+=i;
	}
	System.out.println("The sum of digits is: "+counter);
}
}
