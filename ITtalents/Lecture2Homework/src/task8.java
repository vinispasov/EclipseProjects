import java.util.Scanner;

public class task8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	
	String number =sc.nextLine();    
	int a=number.charAt(0)-'0';    
	int b=number.charAt(1)-'0';    
	int c=number.charAt(2)-'0';    
	int d=number.charAt(3)-'0';
  if (a>b) {
	System.out.println("Bigger "+"("+a+""+d+"<"+b+""+c+")");
}
  else if ((a==b&&d>c)) {
	  System.out.println("Bigger "+"("+a+""+d+"<"+b+""+c+")");
}
  else if (a==b&&d==c) {
	System.out.println("Equal "+"("+a+""+d+"<"+b+""+c+")");
}
  else if ((a<b)) {
	  System.out.println("Smaller "+"("+a+""+d+"<"+b+""+c+")");
}
  else if ((a==b&&d<c)) {
	  System.out.println("Smaller "+"("+a+""+d+"<"+b+""+c+")");
}
  

	
    
	
}
}
