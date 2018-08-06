import java.util.Scanner;
public class Task08RecursionProizvedenie {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=sc.nextInt();
		int product=1;
		int result=findProizvedenie(number,product);
		System.out.println(result);
	}
	static int findProizvedenie(int num, int product) {
		if (num==1) {
			return product*1;
		}
		product*=num;
		num--;
		return findProizvedenie(num,product);
		
	}

}
