package MockExamVariant2;
import java.util.Scanner;
public class Speed {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int numCars=sc.nextInt();
		int speed=sc.nextInt();
		
		int groupNum=1;
		int bestGroupNum=1;
		int groupSum=speed;
		int bestGroupSum=speed;
	

		
		for (int i = 0; i < numCars-1; i++) {
			int currentCarSpeed=sc.nextInt();
			
			if (currentCarSpeed>speed) {
				groupNum++;
				groupSum+=currentCarSpeed;
				
			}
			else {
				speed=currentCarSpeed;
				groupSum=currentCarSpeed;
				groupNum=1;
			}
			
			if (bestGroupNum<groupNum) {
				bestGroupNum=groupNum;
				bestGroupSum=groupSum;
			}
			else if (bestGroupNum==groupNum) {
				bestGroupSum=Math.max(bestGroupSum, groupSum);
			}
			
		}	
		System.out.println(bestGroupSum);
	}

}
