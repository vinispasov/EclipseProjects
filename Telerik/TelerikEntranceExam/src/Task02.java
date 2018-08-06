import java.util.Scanner;
public class Task02 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int sumOfDigits=0;
		int sumMax=0;
		String heaviestWord="";
		
		
		for (int i = 0; i <=n; i++) {
			String word=sc.nextLine();
			for (int j = 0; j < word.length(); j++) {
				String word1=word.toLowerCase();
				char symbol=word1.charAt(j);
				sumOfDigits+=(symbol-96);
			}
		
			if (sumOfDigits>sumMax) {
				sumMax=sumOfDigits;
				heaviestWord=word;
			}
			sumOfDigits=0;
		}
		
		System.out.println(sumMax+" "+heaviestWord);

	}

}
