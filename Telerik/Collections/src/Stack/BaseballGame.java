package Stack;
import java.util.Stack;
public class BaseballGame {
	public static void main(String[] args) {
		
		String[]arr= {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(arr));
		
	}
	
    public static int calPoints(String[] ops) {
    	Stack<Integer>stack=new Stack<>();
    	int sum=0;
      for (String string : ops) {
		if (string.equals("C")) {
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		else if(string.equals("D")){
			if (!stack.isEmpty()) {
				int num=stack.peek();
				stack.push(num*2);
			}
		}
		else if(string.equals("+")) {
			if (!stack.isEmpty()) {
				int num1=stack.peek();
				stack.pop();
				int num2=stack.peek();
				stack.pop();
				stack.push(num2);
				stack.push(num1);
				stack.push(num1+num2);
			}
		}
		else {	
		    int num=Integer.parseInt(string);
		    stack.push(num);
		}
	  }
      
      for (Integer integer : stack) {
		sum+=integer;
	  }
      return sum;
    }

}
