import java.util.Scanner;
public class Task05 {
	 
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first word:");
		String word1=sc.nextLine();
		System.out.println("Enter second word:");
		String word2=sc.nextLine();
		
		char firstWord=word1.charAt(0);
		char secondWord=word2.charAt(0);
		
		boolean found=false;
		int index=0;
		
		for(int i=0;i<word1.length();i++) {
			firstWord=word1.charAt(i);
			
			for(int j=0;j<1;j++) {		
				secondWord=word2.charAt(j);
				if (firstWord==secondWord) {
					found=true;
					index=j;
					break;
				}
			}
		}
		
		if (found) {
		for(int i=0;i<word1.length();i++) {
			firstWord=word1.charAt(i);
			System.out.print(firstWord);
			for(int j=0;j<1;j++) {
				secondWord=word2.charAt(j);
				if (firstWord==secondWord) {
					System.out.print(word2.substring(j+1));
					break;
				}
				
			}
			System.out.println();
		}
		}
		else {
			System.out.println("Not found equal signs.");
		}
		
		
	}

}
