import java.util.Scanner;

public class Task06 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	     
		int[][]arr=new int[6][6];
		int maxSumRows=Integer.MIN_VALUE;
	    
		
		int sumRows=0;
		int sumRows1=0;
		int sumRows3=0;
		int sumRows5=0;
		

		for (int i = 0; i <6; i++) {
			for (int j = 0; j <6; j++) {
			System.out.println("Enter number:");
			arr[i][j]=sc.nextInt();
			}
	    }
		
		for (int rows = 0; rows < arr.length; rows++) {
	
			for (int cols = 0; cols < arr.length; cols++) {

				if (rows==1) {
					sumRows+=arr[rows][cols];
					sumRows1+=arr[rows][cols];
					
				}
				else if (rows==3) {
					sumRows+=arr[rows][cols];
					sumRows3+=arr[rows][cols];
				}
				else if (rows==5) {
					sumRows+=arr[rows][cols];
					sumRows5+=arr[rows][cols];
				}
				
				
				if (maxSumRows<sumRows) {
					maxSumRows=sumRows;
				}
			}
			
		}
		
	    for (int rows = 0; rows < arr.length; rows++) {
			for (int cols = 0; cols < arr.length; cols++) {
				if (rows==1) {
					if (cols==arr.length-1) {
						System.out.print(arr[rows][cols]+" Sum "+sumRows1);
				}
					else {
				System.out.print(arr[rows][cols]+",");
					}
					
				}
				else if (rows==3) {
					if (cols==arr.length-1) {
						System.out.print(arr[rows][cols]+" Sum "+sumRows3);
					}
					else {
						System.out.print(arr[rows][cols]+",");
					}
				}
				else if (rows==5) {
					if (cols==arr.length-1) {
						System.out.print(arr[rows][cols]+" Sum "+sumRows5);
					} 
					else {
						System.out.print(arr[rows][cols]+",");   
					}
					
				}
				
			}
			System.out.println();
		}
		System.out.println("Sum of the elements:"+maxSumRows);
	}

}
