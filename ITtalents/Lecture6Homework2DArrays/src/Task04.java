import java.util.Scanner;

public class Task04 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the volume of first array:");
			int numberFirstArr=sc.nextInt();
	     System.out.println("Enter the volume of second array:");
		    int numberSecondArr=sc.nextInt();
			int[][]arr=new int[numberFirstArr][numberSecondArr];

			for (int i = 0; i <numberFirstArr; i++) {
				for (int j = 0; j <numberSecondArr; j++) {
				System.out.println("Enter number:");
				arr[i][j]=sc.nextInt();
				}
		    }
			for (int i =0; i<numberFirstArr; i++) {
				for (int j =numberSecondArr-1; j>=0; j--) {
					if (j==0) {
						System.out.print(arr[j][i]);
					}
					else {
					System.out.print(arr[j][i]+",");
					}
				}
				System.out.println();
			}
		
	}

}
