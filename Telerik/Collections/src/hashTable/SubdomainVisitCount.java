package hashTable;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
public class SubdomainVisitCount {
	public static void main(String[] args) {
		
	}
	
	 public List<String> subdomainVisits(String[] cpdomains) {
	  
	    
	    HashMap<Integer,String>domains=new HashMap<>();
	    ArrayList<String[]>list=new ArrayList<>();
	    ArrayList<Integer>numbers=new ArrayList<>();
	    List<String>result=new ArrayList<>();
	    StringBuilder sbNumbers;
		 StringBuilder sbStrings;
	    
		 for (int i = 0; i < cpdomains.length; i++) {
			  sbNumbers=new StringBuilder();
			  sbStrings=new StringBuilder();
			 char[]arr=cpdomains[i].toCharArray();
			for (int j =0; j < arr.length; j++) {
				if (Character.isDigit(arr[j])) {
					sbNumbers.append(arr[j]);
				}
				else {
					if (arr[j]==' ') {
						continue;
					}
					sbStrings.append(arr[j]);
				}
			}
			int number=Integer.parseInt(sbNumbers.toString());
			numbers.add(number);
			domains.put(number,sbStrings.toString());
			list.add(sbStrings.toString().split("."));
		 }
		 
		
		 return result;
	 }
	 

		 
}
