import java.util.Scanner;

public class task09 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A:");
	int a=sc.nextInt();
	System.out.println("Enter B:");
	int b=sc.nextInt();
	double sum=0;
	if (a>b) {
		for (int i =b; i <=a; i++) {
			if (i%3==0) {
				System.out.print("Skip "+i+",");
				continue;
			}
			double num=Math.pow(i,2);
			sum+=num;
			
			if (sum>200) {
				System.out.println("The sum is out of Range!");
				break;
			}
			System.out.print(num+",");
		}
	}
	else {
		for (int i =a; i <=b; i++) {
			if (i%3==0) {
				System.out.print("Skip "+i+",");
				continue;
			}
			int num=(int)Math.pow(i,2);
			sum+=num;
			
			if (sum>200) {
				System.out.println("The sum is out of Range!");
				break;
			}
			System.out.print(num+",");
	}
}
}
}
