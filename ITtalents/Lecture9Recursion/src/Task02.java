
public class Task02 {
	
	public static void main(String[]args) {
		int n=-20;
		int result=Counter(n);
		System.out.println(result);
	}
	static int Counter(int m) {
		if (m==50) {
			return 50;
		}
		System.out.println(m);
		return m=Counter(m+1);
	}

}
