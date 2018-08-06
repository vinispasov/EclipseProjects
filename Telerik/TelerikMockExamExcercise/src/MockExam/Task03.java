package MockExam;
import java.util.Scanner;
public class Task03 {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	 int sum=0;
	  
	  while (true) {

		  int n=sc.nextInt();
		  int a=(n/10)/10%10;
		  int b=n/10%10;
		  int c=n%10;
		  
		  if (a+c!=b) {
			  System.out.println(sum);
			  break;
		  }
		  sum+=n;
		
	  
	  
	  }
	
	}
	
}
