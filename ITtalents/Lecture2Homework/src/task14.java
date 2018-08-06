import java.util.Scanner;

public class task14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a:");
	short a=sc.nextShort();
	System.out.println("Enter a1:");
	short a1=sc.nextShort();
	System.out.println("Enter b:");
	short b=sc.nextShort();
	System.out.println("Enter b1:");
	short b1=sc.nextShort();
	if ((a%2==0&&a1%2==0)&&(b%2==0&&b1%2==0)) {
		System.out.println("The positions are with the same color.");
	}
	else if ((a%2==1&&a1%2==1)&&(b%2==1&&b1%2==1)) {
		System.out.println("The positions are with the same color.");
	}
	else if ((a%2==0&&a1%2==0)&&(b%2==0&&b1%2==0)) {
		System.out.println("The positions are with the same color.");
	}
	else if ((a%2==0&&a1%2==0)&&(b%2==1&&b1%2==1)) {
		System.out.println("The positions are with the same color.");
	}
	else if ((a%2==1&&a1%2==1)&&(b%2==0&&b1%2==0)) {
		System.out.println("The positions are with the same color.");
	}
	else if ((a%2==0&&a1%2==1)&&(b%2==1&&b1%2==0)) {
		System.out.println("The positions are with the same color.");
	}
	else if ((a%2==1&&a1%2==0)&&(b%2==0&&b1%2==1)) {
		System.out.println("The positions are with the same color.");
	}
	else {
		System.out.println("The positions are with different color!");
	}
	
}
}
