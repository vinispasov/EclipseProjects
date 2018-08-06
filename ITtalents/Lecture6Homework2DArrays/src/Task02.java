import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the volume of array:");
		int number=sc.nextInt();
		int[][]arr=new int[number][number];

		
		
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j <arr.length; j++) {
			System.out.println("Enter number:");
			arr[i][j]=sc.nextInt();
			}
	    }
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i==j) {
					System.out.print(arr[i][j]+" ");
				}
				 
			}
		}
		System.out.println();
		
		int rows=0;
		int cols=arr.length-1;
		do {
			System.out.print(arr[rows][cols]+" ");
			rows++;
			cols--;
		} while (cols!=-1);
		
	}
}
