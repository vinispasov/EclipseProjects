import java.util.List;
import java.util.ArrayList;
public class ThreeSum {
	public static void main(String[] args) {
		int[]nums={0,-1,1};
		List<List<Integer>>list=threeSum(nums);
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j <list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j)+", ");
			}
		}
	}

	static public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>>list=new ArrayList();
	       
        boolean isValid=false;
        
        for(int i=0;i<nums.length;i++){
            if(nums.length==3
               &&nums[0]==0
               &&nums[1]==0
               &&nums[2]==0){
               list.add(new ArrayList());
               list.get(0).add(0);
               list.get(0).add(0);
               list.get(0).add(0);
                return list;
                
            }
            if(nums[i]!=0){
                isValid=true;
                break;
            }
        }
        if(!isValid){
            return list;
        }

        int count=0;
        
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				for (int k= 0; k < nums.length; k++) {
					if (nums[i]+nums[j]+nums[k]==0) {
						list.add(new ArrayList());
						list.get(count).add(nums[i]);
						list.get(count).add(nums[j]);
						list.get(count).add(nums[k]);
				
                        count++;
					}
                    
				}
				if(j==1){
                    break;
                }		
			}
            break;
		}
	        
		return list;
	}
}
