import java.util.Scanner;

public class task15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter time:");
	short time=sc.nextShort();
	
	if (time>=18) {
		System.out.println("Good Evening");
	}
	else if (time<4) {
		System.out.println("Good Evening");
	}
	else if (time>=4&&time<9) {
		System.out.println("Good Morning");
	}
	else if (time>=9&&time<18) {
		System.out.println("Good Afternoon");
	}
	
	
}
}
