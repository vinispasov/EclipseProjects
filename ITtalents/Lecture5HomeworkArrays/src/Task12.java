import java.util.Scanner;

public class Task12 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		int[]arr=new int[7];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number:");
			arr[i]=sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			if (i==0) {
				int helper=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=helper;
			}
			if (i==2) {
				arr[i]=arr[i]+arr[i+1];
				arr[i+1]=arr[i]-arr[i+1];
				arr[i]=arr[i]-arr[i+1];
			}
			if (i==4) {
				arr[i]=arr[i]*arr[i+1];
				arr[i+1]=arr[i]/arr[i+1];
				arr[i]=arr[i]/arr[i+1];
			}
			
			System.out.print(arr[i]);
		}
}
}
