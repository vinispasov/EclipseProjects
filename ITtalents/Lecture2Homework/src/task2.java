import java.util.Scanner;
public class task2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
	int b=sc.nextInt();
	int sum=a+b;
	int diff=a-b;
	int multi=a*b;
	int divWithRemainder=a%b;
	int division=a/b;
	System.out.println("Sum of 'a' and 'b'="+sum);
	System.out.println("Diff of 'a' and 'b'="+diff);
	System.out.println("Multiplication of 'a' and 'b'="+multi);
	System.out.println("Remainder of 'a' and 'b'="+divWithRemainder);
	System.out.println("Division of 'a' and 'b'="+division);
}
}
