import java.util.Scanner;

public class task9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
	int b=sc.nextInt();
	int c=a*b;
	int lastDigit=c%10;
	if (lastDigit%2==0) {
		System.out.println(c+","+lastDigit+" even");
	}
	else {
		System.out.println(c+","+lastDigit+"Odd");
	
}
}
}
