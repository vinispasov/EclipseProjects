import java.util.ArrayList;
public class Client {
	private String name;
	private String address;
	private double balance;
	private double monthlyWage;
	private ArrayList <Deposit> deposits=new ArrayList();
	private ArrayList <Credit> credits=new ArrayList();
	
	//methods
	
	void makeDeposit(double amount,int period){
		Deposit myDeposit=new Deposit(amount,period);
		this.deposits.add(myDeposit);
	}
	
	void askForCredit() {
		
	}

}
