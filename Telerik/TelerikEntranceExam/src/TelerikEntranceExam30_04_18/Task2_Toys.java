package TelerikEntranceExam30_04_18;
import java.util.Scanner;
public class Task2_Toys {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String array[]=new String[3];
		int kocis=0;
		int cokis=0;
		int diff=0;
		int minPosDiff=Integer.MAX_VALUE;
		String result="";
		String toy="";
		
		for (int i = 0; i <=n; i++) {
			String singleLine=sc.nextLine();
			
			array = singleLine.split(" ");
			for (int j = 0; j < array.length; j++) {
				if (j==0) {
					toy= array[0];
				}
				if (j==1) {
					kocis = Integer.parseInt(array[1]);
				}
				if (j==2) {
					cokis=Integer.parseInt(array[2]);
				}
			}
			
			diff=cokis-kocis;
			
			if (diff<minPosDiff&&diff>0) {
				minPosDiff=diff;
				result=toy;
			}
		}
		System.out.println(result.toString());
	}

}
