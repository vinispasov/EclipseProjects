import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the volume of first array:");
			int numberFirstArr=sc.nextInt();
	     System.out.println("Enter the volume of second array:");
		    int numberSecondArr=sc.nextInt();
			int[][]arr=new int[numberFirstArr][numberSecondArr];

			int sum=0;
			int averageNum=0;
			for (int i = 0; i <numberFirstArr; i++) {
				for (int j = 0; j <numberSecondArr; j++) {
				System.out.println("Enter number:");
				arr[i][j]=sc.nextInt();
				}
		    }
			
			for (int i = 0; i <numberFirstArr; i++) {
				for (int j = 0; j <numberSecondArr; j++) {
				 sum+=arr[i][j];
				}
		    }
			averageNum=sum/(numberFirstArr*numberSecondArr);
			System.out.println("The sum is: "+sum);
			System.out.println("The average arithmetic is: "+averageNum);
	}

}
