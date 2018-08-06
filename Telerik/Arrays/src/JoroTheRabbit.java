import java.util.Scanner;
public class JoroTheRabbit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		
		String[]arr=input.split(", ");
		
		for (int i = 0; i < arr.length; i++) {

		System.out.println(arr[i]);
		}
	}

}
