import java.util.Scanner;

public class Task14 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the volume of array:");
	double[]arr=new double[sc.nextInt()];
	
	int counter=0;
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter number:");
		arr[i]=sc.nextDouble();
        if (arr[i]>=-2.99&&arr[i]<=2.99) {
			counter++;
		}
	}
	
	double[]arr1=new double[counter];
	int indexArr1=0;
	for (int i = 0; i < arr.length; i++) {
        if (arr[i]>=-2.99&&arr[i]<=2.99) {
        	
			arr1[indexArr1]=arr[i];
			indexArr1++;
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
