import java.util.Scanner;
public class Task10 {
	
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	int[]arr=new int[7];
	int counter=0;
	int result=0;
	int diff=0;
	int min=Integer.MAX_VALUE;
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter number:");
		arr[i]=sc.nextInt();
		counter+=arr[i];
	}
	result=counter/arr.length;

	
	for (int i = 0; i < arr.length; i++) {
		diff=Math.abs(result-arr[i]);
		if (diff<min) {
			min=diff;
		}
	}
	for (int i = 0; i < arr.length; i++) {
		if (Math.abs(result-arr[i])==min) {
			System.out.println("Average value: "+result+", "+"Nearest value: "+arr[i]);
		}
	}

}
}
