import java.util.Scanner;
public class Task01 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text:");
		String first=sc.nextLine().toUpperCase();
		System.out.println("Enter text:");
		String second=sc.nextLine().toUpperCase();
		System.out.print(first+" ");
		System.out.print(first.toLowerCase()+" ");
		System.out.print(second+" ");
		System.out.print(second.toLowerCase());
	}

}
