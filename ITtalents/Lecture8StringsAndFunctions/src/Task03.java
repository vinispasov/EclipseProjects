import java.util.Scanner;
public class Task03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings with coma between them:");
		String word=sc.next();
		int index=0;
		for(int i=0;i<word.length();i++) {
			char coma=word.charAt(i);
			if (coma==',') {
				index=i;
			}
		}
		String firstWord=word.substring(0,index);
	 String secondWord=word.substring(index+1);
	 if (firstWord.length()==secondWord.length()) {
		 System.out.println("Both strings are with equal length.");
	    for (int i = 0; i < firstWord.length(); i++) {
		  char fw=firstWord.charAt(i);
		  char sw=secondWord.charAt(i);
		   if (fw!=sw) {
			System.out.println(i+1+" "+fw+"-"+sw);
		   }
	    }
	 }
	 else {
		 System.out.println("The strings are with different length.");
		
	}
}

}
