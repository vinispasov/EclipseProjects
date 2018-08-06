
public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[]arr= {3,-1,4};
		int product;
		int maxProduct=Integer.MIN_VALUE;
		int a=0;
		int b=1;
		if (arr.length==3) {
			maxProduct=arr[0]*arr[1]*arr[2];
		}
		if (arr.length%2==0) {
			
		for (int i = a; i < arr.length; i++) {
			for (int j = b; j < arr.length; j++) {
			
			   product=arr[i]*arr[j];
			   if (product>maxProduct) {
				maxProduct=product;
			   }
			   break;
			}
			b++;
		}
		}
		else {
			for (int i = a; i < arr.length; i++) {
				for (int j = b; j < arr.length; j++) {
				
				   product=arr[i]*arr[j];
				   if (product>maxProduct) {
					maxProduct=product;
				   }
				   break;
				}
				b++;
				if (i==arr.length-1) {
					if (arr[i]>maxProduct) {
						maxProduct=arr[i];
					}
				}
			}
		}
		System.out.println(maxProduct);
	}
}
