import java.util.Scanner;
public class task09 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
	    int a=sc.nextInt();
	    System.out.println("Enter B:");
	    int b=sc.nextInt();
	    int sum=0;
        findNumbers(a,b,sum);
	   
	}
	static int findNumbers(int a,int b,int sum) {
		
		
		if (a<b) {
			if (a%3==0) {
				System.out.print("Skip "+a*a+",");
			}
			else {
		    sum+=a*a;
		    if (sum>=200) {
				return a*a;
			}
	        System.out.print(a*a+",");
			}
		}
		
		return findNumbers(++a,b,sum);
		
	}

}
