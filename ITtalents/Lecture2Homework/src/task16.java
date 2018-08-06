import java.util.Scanner;

public class task16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number(3-digit):");
	
	String number =sc.nextLine(); 
	int num=Integer.parseInt(number);;
	int a=number.charAt(0)-'0';    
	int b=number.charAt(1)-'0';    
	int c=number.charAt(2)-'0';
	if (a==b&&b==c) {
		System.out.println("Digits are equal.");
	}
	else if (a>b&&b>c) {
		System.out.println("Digits are in ascending row.");
	}
	else if (a<b&&b<c) {
		System.out.println("Digits are in descending row.");
	}
	else {
		System.out.println("Digits are out of order!");
	}
	
}
}
