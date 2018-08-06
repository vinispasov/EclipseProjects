package DSA_Practice;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class MessagesInBottle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String code=sc.nextLine();
		String cipher=sc.nextLine();
		
		Map<Character,Integer>table=new HashMap<>();
		int digit=0;
		char alphabet=' ';
		List<Character>list=new ArrayList<>();
		for (int i = 0; i < cipher.toCharArray().length; i++) {
			char ch=cipher.toCharArray()[i];
			
			if (Character.isAlphabetic(ch)) {
				alphabet=ch;
				list.add(alphabet);
			   table.put(alphabet, 0);
			}else {
				digit=ch-'0';
				if (table.containsKey(alphabet)) {
					digit+=table.get(alphabet)*10;
					table.put(alphabet, digit);
				}
				else {
					table.put(alphabet, digit);
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		
		
		for (int i = 0; i < code.length(); i++) {
				for (int j = 0; j <list.size(); j++) {
					if (table.get(list.get(j))==code.charAt(i)-'0') {
						sb.append(list.get(j));
					}
				}
		}
		System.out.println(sb);
		sb.delete(0, sb.length()-1);
		for (int i = 0; i < code.length(); i++) {
			if (i==code.length()-1) {
				break;
			}
			int sum=code.charAt(i)-'0'+code.charAt(i+1)-'0';
			for (int j = 0; j <list.size(); j++) {
				if (table.get(list.get(j))==sum) {
					sb.append(list.get(j));
				}
			}
			
		}
		System.out.println(sb);
	}
	

}
