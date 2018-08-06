package Stack;
import java.util.Iterator;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
public class NextGreaterElement {
	public static void main(String[] args) {
		int[]nums1= {2,4};
		int[]nums2= {1,2,3,4};
		int[] arr=nextGreaterElement(nums1, nums2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stack1=new Stack<>();
        List<Integer>list=new ArrayList<>();
        
        for (int i =nums1.length-1 ; i >=0; i--) {
			stack1.push(nums1[i]);
		}
        
        while(!stack1.isEmpty()) {
			int integer1=stack1.peek();
			stack1.pop();
		
			boolean isEqual=false;
        	 boolean isDone=false;
			for (int i = 0; i < nums2.length; i++) {
				if (integer1==nums2[i]) {
					isEqual=true;
				}
				if (isEqual) {

					if (integer1<nums2[i]) {
						list.add(nums2[i]);
						isDone=true;
						break;
					}
				}
			}
			if (!isDone) {
				list.add(-1);
			}
		}
        
        int[]arr=new int[list.size()];
        for (int i=0;i<arr.length;i++) {
			arr[i]=list.get(i);
		}
        return arr;
        		
    }
}
