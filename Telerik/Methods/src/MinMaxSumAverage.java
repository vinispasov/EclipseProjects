import java.util.Scanner;
import java.text.DecimalFormat;

public class MinMaxSumAverage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		double[]arr=new double[n];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextDouble();
		}
		
		findMinMaxSumAverage(arr);
	
	}
	
	private static void findMinMaxSumAverage(double[]arr){
		
		double min=10001;
		double max=-10001;
		double sum=0;
		double average=0;
		for (int i = 0; i < arr.length; i++) {
		
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
			sum+=arr[i];
			average+=arr[i];
		}
		
		average/=arr.length;
		DecimalFormat df = new DecimalFormat("####0.00");
		
		System.out.println("min="+df.format(min));
		System.out.println("max="+df.format(max));
		System.out.println("sum="+df.format(sum));
		System.out.println("avg="+df.format(average));
		
		
		
	}

}
