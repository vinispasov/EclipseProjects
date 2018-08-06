import java.util.Scanner;
public class MatrixMaxSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		sc.nextLine();
		String[] firstLine=sc.nextLine().split(" ");
		
		int[][]matrix=new int[rows][firstLine.length];
		
		for (int i = 0; i < firstLine.length; i++) {
			int num=Integer.parseInt(firstLine[i]);
			matrix[0][i]=num;
		}
		
		for (int i = 0; i < rows-1; i++) {
			String[]line=sc.nextLine().split(" ");
			matrix=fillMatrix(matrix,line,i+1);
		}
		printMatrix(matrix);
		
		String[] cordinatesCount=sc.nextLine().split(" ");
		int[]cordinates=new int[cordinatesCount.length];
		for (int i = 0; i < cordinates.length; i++) {
			int num=Integer.parseInt(cordinatesCount[i]);
			cordinates[i]=num;
		}
	
		int result=findMaxSum(cordinates,matrix,rows,firstLine.length,Integer.MIN_VALUE,0);
		System.out.println(result);
		
	}
	
	static int findMaxSum(int[]cordinates,int[][]matrix,int rows,int cols,int maxSum,int count) {
		
		if (count>cordinates.length) {
			return maxSum;
		}
		
		int sum=0;
		int row=0;
		int col=0;
		boolean isDone=false;
		for (int i = count; i < cordinates.length; i+=2) {
			row=cordinates[i];
			col=cordinates[i+1];
			break;
		}
		
		count+=2;
		if (row>=0&&col>=0) {
			row-=1;
			col-=1;
			for (int i =row; i>0; i--) {
				for (int j = 0; j < cols; j++) {
					if (j==col) {
						while(i>=0) {
							sum+=matrix[i][j];
							i--;
						}
						isDone=true;
						break;
					}
					sum+=matrix[i][j];
				}
				if (isDone) {
					isDone=false;
					break;
				}
			}
			
		}
		else if (row>=0&&col<0) {
			row-=1;
			col+=1;
			col=Math.abs(col);
			for (int i = row; i <rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (j==col) {
						while(i<rows) {
							sum+=matrix[i][j];
							i++;
						}
						isDone=true;
						break;
					}
					sum+=matrix[i][j];
				}
				if (isDone) {
					isDone=false;
					break;
				}
			}
			
		}
		else if (row<0&&col>=0) {
			row+=1;
			col-=1;
			row=Math.abs(row);
			for (int i =row; i>0; i--) {
				for (int j =cols-1; j >=col; j--) {
					if (j==col) {
						while(i>=0) {
							sum+=matrix[i][j];
							i--;
						}
						isDone=true;
						break;
					}
					sum+=matrix[i][j];
				}
				if (isDone) {
					isDone=false;
					break;
				}
			}
			
		}
		else if (row<0&&col<0) {
			row+=1;
			col+=1;
			row=Math.abs(row);
			col=Math.abs(col);
			for (int i = row; i<rows; i++) {
				for (int j =cols-1; j>=col; j--) {
					if (j==col) {
						while(i<rows) {
							sum+=matrix[i][j];
							i++;
						}
						isDone=true;
						break;
					}
					sum+=matrix[i][j];
				}
				if (isDone) {
					isDone=false;
					break;
				}
			}
			
		}
		if (sum>maxSum) {
			maxSum=sum;
		}
	
		return findMaxSum(cordinates,matrix,rows,cols,maxSum,count);
	}
	
	static int[][]fillMatrix(int[][]matrix,String[]line,int i){
		
		 for (int j = 0; j <line.length; j++) {
			int num=Integer.parseInt(line[j]);
			matrix[i][j]=num;
		 }
		
		return matrix;
	}
	static void printMatrix(int[][]matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
