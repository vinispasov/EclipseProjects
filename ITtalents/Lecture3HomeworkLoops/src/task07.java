import java.util.Scanner;

public class task07 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int number=sc.nextInt();
	
	for (int i =3; i <=number*3; i+=3) {
		if (i==number*3) {
			System.out.println(i);
			break;
		}
	System.out.print(i+",");
	
	}
}
}
