import java.util.Scanner;

public class Task04 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the volume of array:");
	int number=sc.nextInt();
	int[]arr=new int[number];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter number:");
		arr[i]=sc.nextInt();
	}
	
	boolean same=true;
	
	for (int i = 0; i <(arr.length)/2;) {
		for (int j =arr.length-1; j>=arr.length/2; j--,i++) {
			if (arr[i]!=arr[j]) {
				same=false;
			}
			}
	}
	
	if (same) {
		System.out.println("Mirror array.");
	}
	else {
		System.out.println("Not mirror array.");
	}
	
}
}
