import java.util.Scanner;
import java.util.ArrayList;
public class SendMeTheCode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String inp=sc.nextLine().replaceFirst("-","");
		
		
		int a=inp.charAt(0)-'0';
		int b=inp.charAt(1)-'0';
		int c=inp.charAt(2)-'0';
		
	
		int result=0;
		StringBuilder sb=new StringBuilder();
		ArrayList<Integer>reversedNum=new ArrayList();
			reversedNum.add(c);
			reversedNum.add(b);
			reversedNum.add(a);
			
			for (int i = 0; i <reversedNum.size(); i++) {
				if ((i+1)%2==0) {
					result+=(reversedNum.get(i)*reversedNum.get(i))*(i+1);
					
				}
				else {
					result+=((i+1)*(i+1))*reversedNum.get(i);
				}
			}
				
				
			int lastDigit=result%10;
			if (result%10==0) {
				System.out.println(result);
				System.out.println("Big Vik wins again!");
			}
			else {
		int s=result%26;
		for (int i = 0; i <lastDigit; i++) {
			       s++;
			if (s>=27) {
				int diff=s-26;
				s=diff;
			}
			char ch=(char) (s+64);
			sb.append(ch);
		}
		
		System.out.println(result);
		System.out.println(sb.toString());
	}
	}
}
