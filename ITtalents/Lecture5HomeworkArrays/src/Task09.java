import java.util.Scanner;

public class Task09 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the volume of array:");
	int[]arr=new int[sc.nextInt()];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter number:");
		arr[i]=sc.nextInt();
	}
	
	
	System.out.print('[');
	for (int i =arr.length-1; i>=0; i--) {
		if (i==0) {
			System.out.print(arr[i]);
		}
		else {
		System.out.print(arr[i]+",");
		}
	}
	System.out.println(']');
	
	//With second array:
	
    //int[]arr1=new int[arr.length];
    //System.out.print('[');
	//for (int i =arr1.length-1; i>=0; i--) {
		//arr1[i]=arr[i];
		//if (i==0) {
			//System.out.print(arr1[i]);
		//}
		//else {
		//System.out.print(arr1[i]+",");
		//}
	//}
	//System.out.println(']');
	
	
	
	
	
}
}
