import java.util.Scanner;

public class task25 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number:");
	   int num=sc.nextInt();
	   
	   while(!(num>0)) {
			System.out.println("Invalid number, try again:");
			   num=sc.nextInt();
		   }
	   
	   int counter=0;
	   int result=1;
	do {
		counter++;
		result=result*counter;
		
	} while (num!=counter);
	  
	   System.out.println(result);
}
}
