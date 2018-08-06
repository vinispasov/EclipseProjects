import java.util.ArrayList;

public class Bank {
	private String name;
	private String addres;
	private ArrayList<Deposit> deposits=new ArrayList();
	private ArrayList<Credit> credits=new ArrayList();
	private double bankBalance;
	
	//methods
	
	void acceptDeposit(double deposit) {
		bankBalance+=(deposit*0.9);
	}
	void giveCredit(double amount,int period) {
		
	}
	void payInterestAllDeposits() {
		
	}
	
	void calcImportDep() {
		
	}
}
