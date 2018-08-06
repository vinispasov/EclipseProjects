import java.util.Scanner;
public class Task07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int count=sc.nextInt();
		int end=0;
		int number=3;
	      Counter(number,count,end);
		
	}
	 static int Counter(int number,int count,int end) {
		 
		if (number%3==0) {
			end++;
			if (count==end) {
				System.out.println(number);
				return number;
			}
			else {
				System.out.print(number+", ");
			}
		}
		
		return Counter(++number,count,end);
	}

}
