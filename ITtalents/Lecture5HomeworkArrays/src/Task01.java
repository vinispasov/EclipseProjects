import java.util.Scanner;
public class Task01 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the volume of array:");
	int number=sc.nextInt();
	int[]arr=new int[number];
	
	for(int i=0;i<arr.length;i++) {
	  System.out.println("Enter number:");
	  arr[i]=sc.nextInt();
	}
	int smallestNum=Integer.MAX_VALUE;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%3==0) {
			
		if (arr[i]<smallestNum) {
			smallestNum=arr[i];
		}
		}
	}
	
	
	if (smallestNum==Integer.MAX_VALUE) {
		System.out.println("There is no numbers to respond of the condition!");
	}
	else {
	System.out.println("The smallest number fold on 3 is: "+smallestNum);
	}
	
}
}
