import java.util.Scanner;
public class SumDiagonalMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		long[][]matrix=new long[n][n];
		long sum=0;
		
		matrix[0][0]=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				matrix[i][j]=(long)Math.pow(2,i+j);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				if (i<j) {
					sum+=matrix[i][j];
				}
			}
			
		}
		
		System.out.println(sum);
	}

}
