package DSA_Practice;
import java.util.Scanner;
import java.util.ArrayList;
public class CokiSkoki {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int buildingCount=sc.nextInt();
		sc.nextLine();
		String[] buildings=sc.nextLine().split(" ");
		ArrayList<Integer>list=new ArrayList<>();
		int[]arr=new int[buildings.length];
		int counter=0;
		int maxSum=0;
		int count=1;
	
		
		for (int i = 0; i < buildings.length; i++) {
			list.add(Integer.parseInt(buildings[i]));
			
		}
		int currentNum=list.get(0);
		for (int j = 0; j < list.size(); j++) {
		
		   for (int i = count; i <arr.length; i++) {
			  if (currentNum<list.get(i)) {
				currentNum=list.get(i);
				++counter;
				++arr[j];
			  }
		   }
		   if (counter>maxSum) {
			maxSum=counter;
		   }
		   counter=0;
		   if (count<list.size()) {
			currentNum=list.get(count);
		   }
		  
		   ++count;
		}
		
		System.out.println(maxSum);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
