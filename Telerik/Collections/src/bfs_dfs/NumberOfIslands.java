package bfs_dfs;

public class NumberOfIslands {
	public static void main(String[] args) {
		char[][] grid= {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'1','1','0','1','0'},
				};
		System.out.println(numIslands(grid));
		
	}
	
	 public static int numIslands(char[][] grid) {
		 int row=grid.length;
		 boolean isEarth=false;
		 boolean isWater=false;
		 boolean isWaterOtherSide=false;
		 int counter=0;
		 int count=0;
		 
		 for (int i = 0; i < row; i++) {
			 int col=grid[i].length;
			for (int j = 0; j < col; j++) {
				if (grid[i][j]=='1') {
					isEarth=true;
					
				}
				else if (counter==1) {
					isWaterOtherSide=true;
					counter=0;
				}
				else {
					isWater=true;
					++counter;
				}
				++count;
				if (count==3) {
					
				}
			}
		 }
		 
	        return grid.length;
	 }

}
