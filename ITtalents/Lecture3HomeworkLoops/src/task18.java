import java.util.Scanner;

public class task18 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number A:");
	   int a=sc.nextInt();
	   while(!(a>=1&&a<=9)) {
			System.out.println("Invalid number, try again:");
			   a=sc.nextInt();
		   }
	   System.out.println("Enter number B:");
	   int b=sc.nextInt();
	   while(!(b>=1&&b<=9)) {
			System.out.println("Invalid number, try again:");
			   b=sc.nextInt();
		   }
	   for (int i =1; i <=a; i++) {
		for (int j =1; j <=b; j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
		
		
	}
	 
}
}
