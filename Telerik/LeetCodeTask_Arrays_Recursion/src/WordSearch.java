
public class WordSearch {
	public static void main(String[] args) {
		char [][]board =
			{
			      {'A','B','C','E'},
				  {'S','F','C','S'},
				  {'A','D','E','E'}
			};
		
		String[]words=new String[3];
		words[0]= "ABCCED"; 
	    words[1] = "SEE";
		words[2] = "ABCB";
		int counter=0;
		boolean existed=exist(board,words[2]);
		System.out.println(existed);
	}
    public static boolean exist(char[][] board, String word) {
     
    	boolean[][]matrix=new boolean[board.length][board.length];
    	int counter=0;
    	
    	for (int k = 0; k < word.length(); k++) {
		
    	 for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (word.charAt(k)==board[i][j]&&matrix[i][j]==false) {
					matrix[i][j]=true;
					counter++;
					
				}
			}
		 } 
    	}
	
    	if (counter==word.length()-1) {
			return true;
		}
    	else {
    		return false;
    	}
    }

}
