package Task1;
import java.util.Scanner;
public class TaskAllocateArray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			int result=i*5;
			System.out.println(result);
		}
	}

}
