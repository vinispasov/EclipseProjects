package DSA_Practice;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Numerology {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char[]input=sc.nextLine().toCharArray();
		List<Integer>list=new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			list.add(input[i]-'0');
		}
		int counter=0;
		while(counter<list.size()) {
			int a=list.get(counter);
			++counter;
			int b=list.get(counter);
			++counter;
			
			int result=(a + b) * (a ^ b) % 10;
			System.out.println(result);
		}
	}

}
