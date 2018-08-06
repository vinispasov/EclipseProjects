import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Stack;
public class HDNL_Toy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int numInput=sc.nextInt();
		sc.nextLine();
		
		List<Character>alphabets=new ArrayList<>();
		Map<Character,Integer>map=new HashMap<>();
		List<String>result=new ArrayList<>();
		Stack<String>helper=new Stack<>();
		
		for (int i = 0; i <numInput; i++) {
			String in=sc.nextLine();
			
			alphabets.add(in.charAt(0));
			if (in.length()>2) {
				map.put(in.charAt(0), (in.charAt(1)-'0')*10+in.charAt(2)-'0');
			}
			else {
			   map.put(in.charAt(0), in.charAt(1)-'0');
			}
		}
		
	result=solve(alphabets,map,0,0,result,helper,new ArrayList<Integer>());
		
		for (String string : result) {
			System.out.println(string);
		}
		
		
	}

	
     public static List<String> solve(List<Character>alphabets,Map<Character,Integer>map,int digitCount, int counterSpace,List<String> result,Stack<String>stack,List<Integer>digits){
		
		for(int counter = 0;counter<alphabets.size();counter++) {
			StringBuilder sb=new StringBuilder();
			char symbol=alphabets.get(counter);
			int digit=map.get(symbol);
			int nextDigit=map.get(symbol);
			
			
			if (counter<alphabets.size()-1) {
				nextDigit=map.get(alphabets.get(counter+1));
			}

			if (digit<nextDigit) {
				
				
				for (int i = 0; i <counterSpace; i++) {
					sb.append(" ");
				}
				sb.append("<");
				sb.append(symbol);
				sb.append(digit);
			    sb.append(">");
			    result.add(sb.toString());
			    sb.insert(counterSpace+1, "/");
			    stack.push(sb.toString());
			    digitCount=digit;
			    digits.add(digit);
			   ++counterSpace;
			   
			}
			else if(digit==nextDigit) {
				
				
				for (int i = 0; i <counterSpace; i++) {
					sb.append(" ");
				}
				sb.append("<");
				sb.append(symbol);
				sb.append(digit);
			    sb.append(">");
			    result.add(sb.toString());
			    sb.insert(counterSpace+1, "/");
			    result.add(sb.toString());
			    
			}
			else {
				
				for (int i = 0; i <counterSpace; i++) {
					sb.append(" ");
				}
				sb.append("<");
				sb.append(symbol);
				sb.append(digit);
			    sb.append(">");
			    result.add(sb.toString());
			    sb.insert(counterSpace+1, "/");
			    result.add(sb.toString());
				
				if (nextDigit<=digitCount&&!stack.isEmpty()) {
					String str=stack.peek();
					stack.pop();
					result.add(str);
				}
				
				if (!digits.isEmpty()) {
					if (digits.get(digits.size()-1)<nextDigit) {
						continue;
					}
					--counterSpace;
				}
				
			}
		}
		while(!stack.isEmpty()) {
			result.add(stack.peek());
			stack.pop();
		}
    	 return result;
    	 
	}
	
}
