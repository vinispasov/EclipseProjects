import java.util.Scanner;

public class task14 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number:");
	   int num=sc.nextInt();
	   while(!(num>=10&&num<=200)) {
		System.out.println("Invalid number, try again:");
		   num=sc.nextInt();
	   }
	   
	   for (int i =200; i >=1; i--) {
		if (i%7==0&&i<num) {
			System.out.println(i);
		}
	}
}
}
