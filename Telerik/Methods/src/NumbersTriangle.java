import java.util.Scanner;
public class NumbersTriangle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		printTriangle(n);
		
	}
	
	 private static void printTriangle(int n) {
		 //first part of the triangle
		 int counter=1;
		 while (counter<=n) {
			 if (counter>n) {
				break;
			}
			for (int j =1; j <=counter; j++) {
				System.out.print(j);
			}
			System.out.println();
			counter++;	 
		}
		 
		 //second part of the triangle
		 counter=n-1;
		while (counter!=0) {
		 for (int i = 1; i <=counter; i++) {
			System.out.print(i);
		 }
		 System.out.println();
		 counter--;
		}
	}

}
