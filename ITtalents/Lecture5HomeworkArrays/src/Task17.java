import java.util.Scanner;

public class Task17 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the volume of array:");
		int[]arr=new int[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number:");
			arr[i]=sc.nextInt();
		}
		boolean jagged=true;
		for (int i = 1; i < arr.length-1; i++) {
			if (
					!((arr[i]>arr[i+1]&&arr[i]>arr[i-1])
					||(arr[i]<arr[i+1]&&arr[i]<arr[i-1]))) {
				jagged=false;
			}
	
	}
		if (jagged) {
			System.out.println("The array is jagged.");
		}
		else {
			System.out.println("The array is not jagged.");
		}
	}
}
