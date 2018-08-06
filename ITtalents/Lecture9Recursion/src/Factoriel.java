
public class Factoriel {
	public static void main(String[]args) {
		int num=7;
		int result=findFactorial(num);
		System.out.println(result);
		
	}
	static int findFactorial(int num) {
		if (num==1) {
			return num;
		}
		int res=num*findFactorial(num-1);
		return res;
		
	
	}

}
