import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
public class task12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Date dt=new Date();
	Calendar c=Calendar.getInstance();
	
	c.add(Calendar.DATE,1);
	dt=c.getTime();
	System.out.println(dt);
}
}
