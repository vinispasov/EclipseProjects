
public class task23 {
public static void main(String[] args) {
	
	int num=1;
	int counter=1;
	while (counter!=10) {
		
	if (num!=counter+1
			&&num!=counter+2
			&&num!=counter+3
			&&num!=counter+4
			&&num!=counter+5
			&&num!=counter+6
			&&num!=counter+7
			&&num!=counter+8) {
		
		System.out.print(num+"*"+counter+"; ");
	}
		
		
	counter++;
		if (counter==10) {
			num++;
			counter=1;
			System.out.println();
		}
	
		if (num==10) {
			break;
		}
	
	}
}
}
