import java.util.Scanner;

public class Task07 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the volume of array:");
	int[]arr=new int[sc.nextInt()];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter number:");
		arr[i]=sc.nextInt();
	}
	
	int[]arr1=new int[arr.length];
	for(int i=0;i<arr1.length;i++) {
		if (i==0) {
			arr1[i]=arr[i];
		}
		else if (i==arr.length-1) {
			arr1[i]=arr[i];
		}
		else {
		arr1[i]=(arr[i-1]+arr[i+1]);
		}
	}
	
	System.out.print('[');
	for (int i = 0; i < arr1.length; i++) {
		if (i==arr1.length-1) {
			System.out.print(arr1[i]);
		}
		else {
		System.out.print(arr1[i]+", ");
		}
	}
	System.out.println(']');
	
}
}
