import java.util.Scanner;
public class ThreeGroups {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		
	    String[]arr=input.split(" ");
	    int[]arr2=new int[arr.length];
	    
	    StringBuilder remainder0=new StringBuilder();
	    StringBuilder remainder1=new StringBuilder();
	    StringBuilder remainder2=new StringBuilder();
	    
	    for (int i = 0; i < arr.length; i++) {
			arr2[i]=Integer.parseInt(arr[i]);
			if (arr2[i]%3==0) {
				remainder0.append(arr2[i]);
				remainder0.append(' ');
			}
			else if (arr2[i]%3==1) {
				remainder1.append(arr2[i]);
				remainder1.append(' ');
			}
			else if (arr2[i]%3==2) {
				remainder2.append(arr2[i]);
				remainder2.append(' ');
			}
		}
	    System.out.println(remainder0.toString());
	    System.out.println(remainder1.toString());
	    System.out.println(remainder2.toString());
	}

}
