import java.util.Scanner;
public class Task05 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=sc.nextInt();
		System.out.println("Enter number b:");
		int b=sc.nextInt();
		int biggestNumber;
		int smallestNumber;
		if (a>b) {
			biggestNumber=a;
			smallestNumber=b;
		}
		else {
			biggestNumber=b;
			smallestNumber=a;
		}
		int result=Counter(smallestNumber,biggestNumber);
		System.out.println(result);
	}
	static int Counter(int count,int m) {
		if (count==m) {
			return m;
		}
		System.out.println(count);
		return count=Counter(count+1,m);
	}

}
