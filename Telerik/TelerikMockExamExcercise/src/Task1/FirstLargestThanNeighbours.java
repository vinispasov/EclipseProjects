package Task1;
import java.util.Scanner;
public class FirstLargestThanNeighbours {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[]arr=new int[n];
		int indx=0;
		for (int i = 0; i <arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int a=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (i==arr.length-2) {
				if (arr[arr.length-3]<arr[arr.length-2]&&arr[arr.length-2]>arr[arr.length-1]) {
					System.out.println(i+1);
				}
				else {
					System.out.println(-1);
				}
				break;
			}
			if (a<arr[i+1]&&arr[i+1]>arr[i+2]) {
				System.out.println(i+1);
				break;
			}
			else {
				a=arr[i+1];
			}
		}
	}

}
