package hashTable;
import java.util.Scanner;

public class PlusOneMultiplyOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int n=input.charAt(0)-'0';
		int m=input.charAt(2)-'0';
		int counter=0;
		int counterChangeS=0;
		int helper=n;
		int result=n;
		int s1=n+1;
		int s2=0;
		int s3=0;
		boolean isDone=false;
		
		for (int i = 0; i < m; i++) {
			if (counter==4) {
			
			if (counterChangeS==1) {
				helper=s1+1;
				if (isDone) {
					helper+=1;
					isDone=false;
				}
			}
			else if (counterChangeS==2) {
				helper=s2;
			}
			else if(counterChangeS==3) {
				helper=s3;
				counterChangeS=1;
			}
			counter=1;
			}
			if (counter==1) {
				s1=helper;
				if (counterChangeS==0) {
					result=helper+1;
				}
				else {
					result=s1;
					--helper;
				}
			}
			else if(counter==2) {
				s2=(helper*2)+1;
				result=s2;
			}
			else if(counter==3) {
				s3=helper+2;
				result=s3;
				if (counterChangeS==0) {
					isDone=true;
				}
				++counterChangeS;
			}
			++counter;
		}
		System.out.println(result);
	}

}
