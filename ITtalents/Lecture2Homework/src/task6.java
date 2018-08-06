import java.util.Scanner;

public class task6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number a:");
	int a1=sc.nextInt();
	System.out.println("Enter number b:");
	int a2=sc.nextInt();
	System.out.println("Enter number c:");
	int a3=sc.nextInt();
int d=a1;
a1=a2;
a2=a3;
a3=d;
System.out.println(a1);
System.out.println(a2);
System.out.println(a3);

}
}