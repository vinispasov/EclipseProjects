import java.util.ArrayList;
import java.util.Scanner;
public class BiggestPrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
int n=sc.nextInt();
		
		ArrayList<Integer>primes=findPrimesToN(n);
		for (int i = 0; i < primes.size(); i++) {
		   System.out.print(primes.get(i)+" ");
		}
	}
	
	private static ArrayList<Integer>findPrimesToN(int n) {
		ArrayList<Integer>primes=new ArrayList();
		boolean isPrime=false;
		int num=0;
		for (int i = n; i >=1; i--) {
			
			if (i==1) {
				isPrime=true;
				num=i;
				break;
			}
			else if (i==2) {
				isPrime=true;
				num=i;
				break;
			}
			else if (i==3) {
				isPrime=true;
				num=i;
				break;
			}
			else if (i==5) {
				isPrime=true;
				num=i;
				break;
			}
			else if (i==7) {
				isPrime=true;
				num=i;
				break;
			}
			else if (i%2==0
					||i%3==0
					||i%4==0
					||i%5==0
					||i%6==0
					||i%7==0
				    ||i%8==0
					||i%9==0) {
				isPrime=false;
			}
			else {
				isPrime=true;
				num=i;
				break;
			}
			
		
		}
		primes.add(num);
		return primes;
	}


}
