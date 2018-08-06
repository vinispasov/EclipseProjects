import java.util.Scanner;
public class Task02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two words with minimum 10 characters, up to 20:");
		String firstWord=sc.next();
		String secondWord=sc.next();
		while (firstWord.length()<5&&secondWord.length()<5) {
			System.out.println("Enter two words with minimum 10 characters, up to 20:");
			firstWord=sc.next();
			secondWord=sc.next();
			
		}
		
		
		String cutFirst=firstWord.substring(0, 5);
		String cutFirstBack=firstWord.substring(5);
		String cutSecond=secondWord.substring(0, 5);
		String cutSecondBack=secondWord.substring(5);
		if (cutFirst.length()+cutSecondBack.length()
		>=cutSecond.length()+cutFirstBack.length()) {
			System.out.println(cutFirst.length()+cutSecondBack.length()+" "
		+cutFirst+cutSecondBack);
		}
		else {
			System.out.println(cutSecond.length()+cutFirstBack.length()+" "
		+cutSecond+cutFirstBack);
		}
	}

}
