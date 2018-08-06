import java.util.Scanner;
public class ExpressionAgain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		int n=sc.nextInt();
		int[]arr=new int[in.length()];
		for (int i = 0; i < in.length(); i++) {
			int num=in.charAt(i)-'0';
			arr[i]=num;
		}
		
		int result=calculateNumbers(arr,0,0,n);
		System.out.println(result);
	}
	static int calculateNumbers(int[]arr,int index,int currentSum, int targetSum) {

		if (index==arr.length) {
			if (currentSum==targetSum) {
				return 1;
			}
			else {
				return 0;
			}
	    }
		
		int count=0;
		int number=0;
		
		for (int i = index; i < arr.length; i++) {
			number*=10;
			number+=arr[i];
			count+=calculateNumbers(arr,index+1,currentSum+number,targetSum);
			count+=calculateNumbers(arr,index+1,currentSum-number,targetSum);
			count+=calculateNumbers(arr,index+1,currentSum*number,targetSum);
			if (number==0) {
				break;
			}
		}
		return count;
    }
	
	
	
}