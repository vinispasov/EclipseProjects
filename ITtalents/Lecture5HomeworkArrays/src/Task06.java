import java.util.Scanner;
public class Task06 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the volume of array 1:");
	int[]arr1=new int[sc.nextInt()];
	
	for (int i = 0; i < arr1.length; i++) {
		System.out.println("Enter number:");
		arr1[i]=sc.nextInt();
	}
	System.out.println("Enter the volume of array 2:");
	int[]arr2=new int[sc.nextInt()];
	
	for (int i = 0; i < arr2.length; i++) {
		System.out.println("Enter number:");
		arr2[i]=sc.nextInt();
	}
	
	boolean equal=true;
	
	if (arr1.length==arr2.length) {
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i]!=arr2[i]) {
				equal=false;
				break;
				}
		}
	}
	else {
		equal=false;
	}
	
	if (equal) {
	System.out.println("The arrays are equal.");	
	}
	else {
		System.out.println("The arrays are different.");
	}
	
}
}
