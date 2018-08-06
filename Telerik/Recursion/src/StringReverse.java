import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		
		System.out.println(reverseString(input));
	}

	static String reverseString(String input) {
		
		if (input.length()==0) {
			return input;
		}
		char firstChar=input.charAt(0);
		 String reversed=reverseString(input.substring(1))+firstChar;
		 return reversed;
	}
}
