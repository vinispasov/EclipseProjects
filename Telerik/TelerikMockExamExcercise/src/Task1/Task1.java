package Task1;
import java.util.Scanner;
public class Task1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
			String number=sc.nextLine();
			int number1=0;
		
		 
		for (int i = 0; i < number.length(); i++) {
			char symbol=number.charAt(i);
			if (symbol=='0'
				        ||symbol=='1'
						||symbol=='2'
						||symbol=='3'
						||symbol=='4'
						||symbol=='5'
						||symbol=='6'
						||symbol=='7'
						||symbol=='8'
						||symbol=='9') {
				
				number1=(int)symbol;
			}
		}
		
		
		
	}

}
