import java.util.Scanner;

public class task19 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number:");
	   int number=sc.nextInt();
	   while(!(number>=10&&number<=99)) {
			System.out.println("Invalid number, try again:");
			   number=sc.nextInt();
		   }
	  
	  double result=number;
	  
while (result!=1) {
	if (result%2==0) {
		result=result*0.5;
		System.out.println(result);
	}
	else {
		result=3*result+1;
		System.out.println(result);
	}
}
}	    
}

	
	   
	   
	   


