
public class Task01 {
	
	public static void main(String[]args) {
		int m=1;
		
		int result=Numbers(m);
		
		System.out.println(result);
		
	}
	
	static int Numbers(int n) {
		if (n==100) {
			return 100;
		}
		System.out.println(n);
		return n=Numbers(n+1);
		 
				
	}
	

}
