import java.util.Scanner;
public class Task01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int num5=sc.nextInt();
		
		int[]numbers=new int[5];
		numbers[0]=num1;
		numbers[1]=num2;
		numbers[2]=num3;
		numbers[3]=num4;
		numbers[4]=num5;
		

		
		for (int i = 0; i < 5; i++) {
			int digit1 =numbers[i]%10;
			int digit2=(numbers[i]/10)%10;
			int digit3=(numbers[i]/10)/10%10;
			
			
			int product=digit1*digit2*digit3;
			int result=product%10;
			System.out.print(result);
		}
		
	}

}
