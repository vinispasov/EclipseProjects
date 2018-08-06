package Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
public class AsteroidCollision {
	public static void main(String[] args) {
		int[]arr= {1,-2,-2,-1};
		
		arr=asteroidCollision(arr);
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a]+" ");
		}
	}
	
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
			stack.push(asteroids[i]);
		}
        while(!stack.isEmpty()) {
			int num1=stack.peek();
			stack.pop();
			if (!stack.isEmpty()) {
				int num2=stack.peek();
				stack.pop();
			
			if (num1<0&&num2<0) {
				list.add(num1);
				stack.push(num2);
			}
			else if (num1>0&&num2>0) {
				list.add(num1);
				stack.push(num2);
			} 
			else if (num1>0&&num2<0) {
				list.add(num1);
				stack.push(num2);
			}
			else {
				//collision
				int a=Math.abs(num1);
				int b=Math.abs(num2);
				
				if (a>b) {
					stack.push(num1);
				}
				else if(a<b) {
					stack.push(num2);
				}
				for (int i =list.size()-1; i>=0; i--) {
					stack.push(list.get(i));
				}
				list.clear();
			}
		  }
			else {
				list.add(num1);
			}
		}
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    } 

}
