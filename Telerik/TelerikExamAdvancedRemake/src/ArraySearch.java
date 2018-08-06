import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArraySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		String[]masiv=input.split(",");
		ArrayList<Integer>list=new ArrayList<Integer>();
		for (int i = 0; i < masiv.length; i++) {
			list.add(Integer.parseInt(masiv[i]));
		}
		Collections.sort(list);
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i <list.size(); i++) {
			if (!list.contains(i+1)) {
				sb.append(i+1);
				sb.append(',');
			}		
		}
		if (sb.length()==0) {
			System.out.println(sb.toString());
		}else {
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
		}
	}

}
