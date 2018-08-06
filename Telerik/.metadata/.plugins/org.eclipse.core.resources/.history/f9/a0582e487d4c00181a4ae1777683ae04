package TelerikEntranceExam30_04_18;
import java.util.Scanner;
public class Task3_WordAnagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sumOfW=0;
		int sumOfCurrentW=0;
		String w=sc.nextLine();
		
		for (int i = 0; i < w.length(); i++) {
			char ch=w.charAt(i);
			sumOfW+=ch;
		}
		
		int n=sc.nextInt();
		sc.nextLine();
		String[]words=new String[n];
		
		for (int i = 0; i <words.length; i++) {
			words[i]=sc.nextLine();
			
			for (int j = 0; j < words[i].length(); j++) {
				char ch=words[i].charAt(j);
				sumOfCurrentW+=ch;
			}
			
			if (sumOfCurrentW==sumOfW) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			sumOfCurrentW=0;
		}
	}

}
