
public class task01 {
	public static void main(String[] args) {
		int[]arr= {4,3,5,2};
		int[]arr1= {1,6,3,5,3,7};
		int[]result=new int[arr.length+arr1.length];
		int[]masiv=convertArrays(arr,arr1);
		for (int i = 0; i < masiv.length; i++) {
			System.out.print(masiv[i]+" ");
		}
	
		
		
	}
	static int[]convertArrays(int[]arr,int[]arr1){
		int[]masiv=new int[arr.length+arr1.length];
		int arrayLength=arr.length+arr1.length;
		for (int i = 0; i < arr.length; i++) {
			masiv[i]=arr[i];
			if (i==arr.length-1) {
				for (int j =0; j <arr1.length; j++) {
					masiv[j+arr.length]=arr1[j];
				}
			}
		}
		
		return masiv;
	}

}
