import java.util.Scanner;

public class Task04 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full names of two people with coma between them:");
		String names=sc.nextLine();
		int index=0;
		int name1=0;
		int name2=0;
		for(int i=0;i<names.length();i++) {
			char coma=names.charAt(i);
			if (coma==',') {
				index=i;
			}
		}
		String firstName=names.substring(0,index);
	 String secondName=names.substring(index+1);
	 for (int i = 0; i < firstName.length(); i++) {
		char fn=firstName.charAt(i);
		
		name1+=fn;

	}
	 for (int i = 0; i < secondName.length(); i++) {
		 char sn=secondName.charAt(i);
			
			name2+=sn;
	}
	 if (name1>name2) {
		System.out.println(firstName);
	}
	 else if (name1<name2) {
		System.out.println(secondName);
	}
	 else {
		System.out.println(firstName);
		System.out.println(secondName);
	}
	 
	 
	}

}
