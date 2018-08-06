import java.util.Scanner;

public class task10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=sc.nextInt();
	
	
	if (num%2==0
			||num%3==0
			||num%4==0
			||num%5==0
			||num%6==0
			||num%7==0
			||num%8==0
			||num%9==0) {
		if (num==2||num==3||num==5||num==7) {
			System.out.println("Is Prime.");
			
		}
		else {
		System.out.println("Is not Prime.");
		}
	}
	else {
		System.out.println("Is Prime.");
	}
}
}
