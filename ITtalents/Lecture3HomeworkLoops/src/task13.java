import java.util.Scanner;

public class task13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number:");
	   int num=sc.nextInt();
	   while(!(num>=2&&num<=27)) {
		System.out.println("Invalid number, try again:");
		   num=sc.nextInt();
	   }
	
	for (int j =1; j <=9; j++) {
		
		for (int i = 0; i<=9; i++) {
			for (int k = 0; k <=9; k++) {
				
				if (j+i+k==num) {
					System.out.println(j+""+i+""+k);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
}
}
