
public class Task04 {

	public static void main(String[]args) {
		int n=10;
		int result=Counter(n);
		System.out.println(result);
	}
	static int Counter(int m) {
		if(m==1) {
			return 1;
		}
		System.out.println(m);
		return m=Counter(m-1);
	}
}
