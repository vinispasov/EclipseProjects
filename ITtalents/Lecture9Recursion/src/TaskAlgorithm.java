
public class TaskAlgorithm {

	public static void main(String[] args) {
		 
		int[]arr={5,7,4,8,3,9,1,11};
		 selectionSort(arr); 
		 
		 System.out.print("[");
		    for (int i = 0; i < arr.length; i++) {
		    	if (i==arr.length-1) {
					System.out.print(arr[i]);
				}
		    	else {
		            System.out.print(arr[i]+",");
		    	}
		    }
		 System.out.println("]");   
	}

	static void selectionSort(int[]arr){

    for (int k = 0; k < arr.length/2; k++) {
		  int min=arr[k];
		  int minIdx=k;
		  int max=arr[k];
		  int maxIdx=k;

	    for (int i =k+1; i < arr.length-k; i++) {

		   if (min>arr[i]) {
		    min=arr[i];
		    minIdx=i;
		   }
		   if (arr[i]>max) {
		    max=arr[i];
		    maxIdx=i;
		   }
		}

		  int temp=arr[k];
		  arr[k]=arr[minIdx];
		  arr[minIdx]=temp;
		    if (k==(arr.length-1)/2) {
			    break;
		    }
		  temp=arr[arr.length-1-k];
		  arr[arr.length-1-k]=arr[maxIdx];
		  arr[maxIdx]=temp;
	 }
   }
}
