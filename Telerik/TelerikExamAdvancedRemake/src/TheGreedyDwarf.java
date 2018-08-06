import java.util.Scanner;
public class TheGreedyDwarf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputSize=sc.nextLine();
		int rows=inputSize.charAt(0)-48;
		int cols=inputSize.charAt(2)-48;
		
		int[][]arr=new int[rows][cols];
		
		int row=0;
		int col=0;
		int sum=0;
		for (int i = 0; i < rows; i++) {
			String input=sc.nextLine();
			String[]masiv=input.split(" ");
			for (int j = 0; j < cols; j++) {
				arr[i][j]=Integer.parseInt(masiv[j]);
				if (arr[i][j]==0) {
					row=i;
					col=j;
				}
			}
			
		}
		while(true) {
			
	        if (col-1<0&&row-1<0) {
	        	if (arr[row][col+1]>=arr[row+1][col]
	    				&&arr[row][col+1]>0) {
	    			arr[row][col+1]--;
	    			sum++;
	    			col++;
	    			continue;
	    		}
	        	else if (arr[row+1][col]>=arr[row][col+1]
	    			   &&arr[row+1][col]>0) {
	    			arr[row+1][col]--;
	    			sum++;
	    			row++;
	    			continue;
	    		}
	        	break;
			}
			if (col-1<0&&row+1>rows-1) {
				if (arr[row][col+1]>=arr[row-1][col]
	    				&&arr[row][col+1]>0) {
	    			arr[row][col+1]--;
	    			sum++;
	    			col++;
	    			continue;
	    		}
				else if (arr[row-1][col]>=arr[row][col+1]
										&&arr[row-1][col]>0) {
					arr[row-1][col]--;
					sum++;
					row--;
					continue;
				}
				break;
			}
			if (col+1>cols-1&&row-1<0) {
				if (arr[row][col-1]>=arr[row+1][col]
									&&arr[row][col-1]>0) {
					arr[row][col-1]--;
					sum++;
					col--;
					continue;
				}
				else if (arr[row+1][col]>=arr[row][col-1]
								&arr[row+1][col]>0) {
					arr[row+1][col]--;
					sum++;
					row++;
					continue;
				}
				break;
			}
			if (col+1>cols-1&&row+1>rows-1) {
				if (arr[row][col-1]>=arr[row-1][col]
										&&arr[row][col-1]>0) {
					arr[row][col-1]--;
					sum++;
					col--;
					continue;
				}
				else if (arr[row-1][col]>=arr[row][col-1]
										&&arr[row-1][col]>0) {
					arr[row-1][col]--;
					sum++;
					row--;
					continue;
				}
				break;
			}
			if (col-1<0) {
				if (arr[row][col+1]>=arr[row-1][col]
						&&arr[row][col+1]>=arr[row+1][col]
							&&arr[row][col+1]>0) {
					arr[row][col+1]--;
					sum++;
					col++;
					continue;
				}
				else if (arr[row-1][col]>=arr[row][col+1]
								&&arr[row-1][col]>=arr[row+1][col]
										&&arr[row-1][col]>0) {
					arr[row-1][col]--;
					sum++;
					row--;
					continue;
				}
				else if (arr[row+1][col]>=arr[row][col+1]
								&&arr[row+1][col]>=arr[row-1][col]
										&&arr[row+1][col]>0) {
					arr[row+1][col]--;
					sum++;
					row++;
					continue;
				}
				break;
			}
			if (row-1<0) {
				if (arr[row][col-1]>=arr[row][col+1]
								&&arr[row][col-1]>=arr[row+1][col]
										&&arr[row][col-1]>0) {
					arr[row][col-1]--;
					sum++;
					col--;
					continue;
				}
				else if (arr[row][col+1]>=arr[row][col-1]
								&&arr[row][col+1]>=arr[row+1][col]
										&&arr[row][col+1]>0) {
					arr[row][col+1]--;
					sum++;
					col++;
					continue;
				}
				else if (arr[row+1][col]>=arr[row][col-1]
						&&arr[row+1][col]>=arr[row][col+1]
										&&arr[row+1][col]>0) {
					arr[row+1][col]--;
					sum++;
					row++;
					continue;
				}
				break;
			}
			if (col+1>cols-1) {
				if (arr[row][col-1]>=arr[row-1][col]
								&&arr[row][col-1]>=arr[row+1][col]
										&&arr[row][col-1]>0) {
					arr[row][col-1]--;
					sum++;
					col--;
					continue;
				}
				else if (arr[row-1][col]>=arr[row][col-1]
								&&arr[row-1][col]>=arr[row+1][col]
										&&arr[row-1][col]>0) {
					arr[row-1][col]--;
					sum++;
					row--;
					continue;
				}
				else if (arr[row+1][col]>=arr[row][col-1]
								&&arr[row+1][col]>=arr[row-1][col]
										&&arr[row+1][col]>0) {
					arr[row+1][col]--;
					sum++;
					row++;
					continue;
				}
				break;
			}
			if (row+1>rows-1) {
				if (arr[row][col-1]>=arr[row][col+1]
						&&arr[row][col-1]>=arr[row-1][col]
										&&arr[row][col-1]>0) {
					arr[row][col-1]--;
					sum++;
					col--;
					continue;
				}
				else if (arr[row][col+1]>=arr[row][col-1]
						&&arr[row][col+1]>=arr[row-1][col]
										&&arr[row][col+1]>0) {
					arr[row][col+1]--;
					sum++;
					col++;
					continue;
				}
				else if (arr[row-1][col]>=arr[row][col-1]
						&&arr[row-1][col]>=arr[row][col+1]
										&&arr[row-1][col]>0) {
					arr[row-1][col]--;
					sum++;
					row--;
					continue;
				}
				
				break;
			}
			
			
			if (arr[row][col-1]>=arr[row][col+1]
					&&arr[row][col-1]>=arr[row-1][col]
							&&arr[row][col-1]>=arr[row+1][col]
									&&arr[row][col-1]>0) {
				arr[row][col-1]--;
				sum++;
				col--;
				continue;
			}
			else if (arr[row][col+1]>=arr[row][col-1]
					&&arr[row][col+1]>=arr[row-1][col]
							&&arr[row][col+1]>=arr[row+1][col]
									&&arr[row][col+1]>0) {
				arr[row][col+1]--;
				sum++;
				col++;
				continue;
			}
			else if (arr[row-1][col]>=arr[row][col-1]
					&&arr[row-1][col]>=arr[row][col+1]
							&&arr[row-1][col]>=arr[row+1][col]
									&&arr[row-1][col]>0) {
				arr[row-1][col]--;
				sum++;
				row--;
				continue;
			}
			else if (arr[row+1][col]>=arr[row][col-1]
					&&arr[row+1][col]>=arr[row][col+1]
							&&arr[row+1][col]>=arr[row-1][col]
									&&arr[row+1][col]>0) {
				arr[row+1][col]--;
				sum++;
				row++;
				continue;
			}
			
			break;
		}
		System.out.println(sum);
	}
	
}
