import java.util.Scanner;
public class Task03 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String title1=sc.nextLine();
		StringBuilder title=new StringBuilder(title1);
		int n=sc.nextInt();
		boolean itContains=false;
		int counter=0;
		
		 StringBuilder sb=new StringBuilder(title);
		
		for (int i = 0; i <n; i++) {
			String word=sc.nextLine();
		 
		  for (int j = 0; j < word.length(); j++) {
			  
			for (int j2 = 0; j2 < sb.length(); j2++) {
				if (title.charAt(j2)==word.charAt(j)) {
					
					title=sb.deleteCharAt(j2);
						itContains=true;
						counter++;
						break;
				}
				
			}
			
		  }
		  if (counter<2) {
				itContains=false;
			}
			counter=0;
			
			if (itContains) {
				System.out.println(sb.toString());
			}
			else {
				System.out.println("No such title found!");
				break;
			}
		  
		 itContains=false;
		}

}
}