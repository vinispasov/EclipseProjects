import java.util.Scanner;
public class Task01Coin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int counter=0;
		String coin="";
		do {
			System.out.println("Enter coin:");
			coin=sc.nextLine();
			
			if (coin.equals("Heads")) {
				counter++;
				
				
			}
			else if (coin.equals("Tails")) {
				counter=0;
			}
			
	} while (counter!=5);
		System.out.println(counter);
	}

}
