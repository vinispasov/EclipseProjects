package TelerikEntranceExam30_04_18;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		int l=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int result=0;
		if (n>l) {
			int rest=n-l;
			result=(rest*m)+k;
		}
		else {
			result=k;
		}
		System.out.println(result);
	}

}
