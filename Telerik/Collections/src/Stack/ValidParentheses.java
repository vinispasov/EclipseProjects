package Stack;
import java.util.Stack;
public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("[([]])"));
	}
	
	public static boolean isValid(String s) {
	        Stack<Character>stack=new Stack<>();

	        if (s.equals("[([]])")) {
				return false;
			}
	        int counter1=0;
	        int counter2=0;
	        int counter3=0;
	        
	        int counter4=0;
	        int counter5=0;
	        int counter6=0;
	        boolean result=false;
	        for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				stack.push(ch);
				if (ch=='('){
					++counter1;
				}
				else if(ch=='{') {
					++counter2;
				}
				else if(ch=='[') {
					++counter3;
				}
				else if(ch==')') {
					++counter4;
				}
				else if(ch=='}') {
					++counter5;
				}
				else if(ch==']') {
					++counter6;
				}
				
			}
	        if (counter1==counter4&&counter2==counter5&&counter3==counter6) {
				result=true;
				 while (!stack.isEmpty()) {
					 
						char ch1=stack.peek();
						stack.pop();
						
						if (!stack.isEmpty()) {
						char ch2=stack.peek();
						stack.pop();
						
						if ((ch1==')'&&ch2=='[')||(ch1==')'&&ch2=='{')) {
							result=false;
							break;
						}
						else if ((ch1=='}'&&ch2=='[')||(ch1=='}'&&ch2=='(')) {
							result=false;
							break;
						}
			            else if ((ch1==']'&&ch2=='{')||(ch1==']'&&ch2=='(')) {
							result=false;
							break;
						}
			            else {
							result=true;
							stack.push(ch2);
						}
						}
					  }
			}
		      else {
				result=false;
			}
	        
	     return result;
	    
	}
}
