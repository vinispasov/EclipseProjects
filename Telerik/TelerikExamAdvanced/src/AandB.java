import java.util.Scanner;
import java.util.ArrayList;
public class AandB {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String input=sc.nextLine();
		String[]in=input.split(" ");
		
	    int a=in[0].charAt(0)-48;
	    int b=in[1].charAt(0)-48;
		
	    ArrayList<Integer>result=new ArrayList();
	    StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			if (i==0) {
				if (a>b) {
					sb.append(b);
				}
				else {
					sb.append(a);
				}
			}
			else {
			sb.append(0);
			}
		}
		for (int i = 0; i < n; i++) {
			if (a>b) {
				sb1.append(a);
			}
			else {
				sb1.append(b);
			}
		}
		int startingNum=Integer.parseInt(sb.toString());
		int endNum=Integer.parseInt(sb1.toString());
		
		result=findCombinations(startingNum,endNum,n,a,b,result);
		
			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
	}
	static ArrayList<Integer> findCombinations(int startingNum,int endNum,int n,int a,int b,ArrayList<Integer>result) {
		if (startingNum>endNum) {
			return result;
		}
		boolean isCorrect=findDigits(startingNum,endNum,n,a,b);
		if (isCorrect) {
			result.add(startingNum);
		}
		return findCombinations(++startingNum,endNum,n,a,b,result);
	}
	static boolean findDigits(int start,int end, int n,int a,int b) {
		boolean isCorrectNum=false;
		for (int i = 0; i < n; i++) {
			int num=start%10;
			if (num==a||num==b) {
				isCorrectNum=true;
				
			}
			else {
				isCorrectNum=false;
				break;
			}
			start/=10;
		}
		return isCorrectNum;
	}

}
