import java.util.Scanner;

public class task15 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number:");
	   int number=sc.nextInt();
	   int counter=0;
	   int sum=0;
	   do {
		   sum+=counter;
		counter++;
	} while (counter!=number+1);
	   System.out.println(sum);
	   }
}

