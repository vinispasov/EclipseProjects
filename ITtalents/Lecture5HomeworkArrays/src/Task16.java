import java.util.Scanner;

public class Task16 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	double[]arr=new double[10];
	double[]arr1=new double[arr.length];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter number for the first array:");
		arr[i]=sc.nextDouble();
	}	
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]<-0.231) {
			arr1[i]=Math.pow(i+1,2)+41.25;
		}
		else {
			arr1[i]=arr[i]*(i+1);
		}
	}
	
	System.out.println("First array:" );
	System.out.print('[');
	for (int i = 0; i < arr.length; i++) {
		if (i==arr.length-1) {
			System.out.print(arr[i]);
		}
		else {
			System.out.print(arr[i]+",");
		}
	}
	System.out.println(']');
	
	System.out.println("Second array:" );
	System.out.print('[');
	for (int i = 0; i < arr1.length; i++) {
		if (i==arr1.length-1) {
			System.out.print(arr1[i]);
		}
		else {
			System.out.print(arr1[i]+",");
		}
	}
	System.out.println(']');
}
}
