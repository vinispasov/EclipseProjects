import java.util.Scanner;
public class Task06 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence or word:");
		String sentence=sc.nextLine();
		int index=0;
		
		for (int i = 0; i < sentence.length(); i++) {
			char symbol=sentence.charAt(i);
			
			if (symbol==' ') {
				index=i+1;
				System.out.print(' ');
			}
			else if (i==index) {
				System.out.print(sentence.substring(index,i+1).toUpperCase());
			}
			else if (i==0) {
				System.out.print(sentence.substring(0,1).toUpperCase());
			}
			else {
				System.out.print(sentence.substring(i,i+1));
			}
		}
	}

}
