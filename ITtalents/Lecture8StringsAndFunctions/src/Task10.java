 import java.util.Scanner;
public class Task10 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String words=sc.nextLine();
		
		for (int i = 0; i < words.length(); i++) {
			char symbol=words.charAt(i);
			int newSymbols=symbol+5;
			System.out.print((char)newSymbols);
		}
		
	}

}
