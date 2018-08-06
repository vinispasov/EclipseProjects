package MockExamVariant2;
import java.util.Scanner;
public class Game {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int a=(num/10)/10%10;
		int b=num/10%10;
		int c=num%10;
		int sum=0;
		int product=0;
		
		if (a==1&&b!=1&&c!=1) {
			sum+=b*c+a;
		}
		else if (a!=1&&b==1&&c!=1) {
			sum+=a*c+b;
		}
		else if (a!=1&&b!=1&&c==1) {
			sum+=b*a+c;
		}
		else if (a==1&&b==1&&c!=1) {
			sum+=a+b+c;
		}
		else if (a!=1&&b==1&&c==1) {
			sum+=a+b+c;
		}
		else if (a==1&&b!=1&&c==1) {
			sum+=a+b+c;
		}
		else if (a==0&&b==0&&c!=0) {
			sum+=a+b+c;
		}
		else if (a!=0&&b==0&&c==0) {
			sum+=a+b+c;
		}
		else if (a==0&&b!=0&&c==0) {
			sum+=a+b+c;
		}
		else if (a==0&&b!=0&&c!=0) {
			sum+=b*c+a;
		}
		else if (a!=0&&b==0&&c!=0) {
			sum+=a*c+b;
		}
		else if (a!=0&&b!=0&&c==0) {
			sum+=b*a+c;
		}
		else if (a==1&&b==1&&c==1) {
			sum+=a+b+c;
		}
		else if (a!=0&&b==0&&c==0) {
			sum+=a;
		}
		else if (a!=0&&b==0&&c==1) {
			sum+=a+c;
		}
		else if (a!=0&&b==1&&c!=0) {
			sum+=a*c+b;
		}
		else if (a!=0&&b!=0&&c==1) {
			sum+=a*b+c;
		}
		else if (a!=0&&b==1&&c==1) {
			sum+=a+b+c;
		}
		else {
			product+=a*b*c;
		}
		
		
		if (product>sum) {
			System.out.println(product);
		}
		else {
			System.out.println(sum);
		}
	}

}
