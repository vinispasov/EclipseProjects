import java.util.Scanner;
public class task14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		findNumbers(num);
	}
	static void findNumbers(int num) {
		if (num==7) {
			System.out.println(num);
			return;
		}
		if (num%7==0) {
			System.out.println(num);
		}
			findNumbers(num-1);
		
		

}
}