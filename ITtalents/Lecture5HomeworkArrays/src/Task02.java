import java.util.Scanner;
public class Task02 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the volume of array:");
	int[]arr=new int[sc.nextInt()];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter number:");
		arr[i]=sc.nextInt();
	}
	
	int[]newArr=new int[arr.length];
	
	System.out.print("[");
	for (int i = 0; i <arr.length; i++) {
		if (arr[i]==arr[(arr.length)/2]) {
		for (int j =(arr.length-1)/2; j>=0; j--) {
			newArr[j]=arr[j];
			if (j==0) {
				System.out.print(newArr[j]);
			}
			else {
			System.out.print(newArr[j]+",");
			}
		}
		break;
		}
		newArr[i]=arr[i];
		System.out.print(newArr[i]+",");
	}
	System.out.println(']');
	
	
}
}
