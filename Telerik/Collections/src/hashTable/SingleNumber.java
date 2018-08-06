package hashTable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
public class SingleNumber {
	public static void main(String[] args) {
		int[]nums= {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
	        int result=0;
		 HashSet<Integer>numbers=new HashSet<>();
		 ArrayList<Integer>arrNumbers=new ArrayList();
		 for (int i = 0; i < nums.length; i++) {
			arrNumbers.add(nums[i]);
			numbers.add(nums[i]);
		 }
		 
		 for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
			if (arrNumbers.contains(integer)) {
					arrNumbers.remove(integer);
			}
		 }
		 
		 for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			if (!arrNumbers.contains(integer)) {
				result=integer;
				break;
			}
			
		 }
		  return result;
    }

}
