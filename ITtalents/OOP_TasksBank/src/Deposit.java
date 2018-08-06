
public class Deposit extends BankProducts {
	private double depositSumPaid;
	
	
	public Deposit(double amount,int period){
		if (period<=3) {
			this.setYearInterestPercent(0.03);
		}
		else if (period>3&&period<=12) {
			this.setYearInterestPercent(0.05);
		}
		else {
			this.setYearInterestPercent(0.07);
		}
		
		this.setBalance(amount);
		this.setPeriod(period);
	}
	
	
	//getters and setters
	public double getDepositSumPaid() {
		return depositSumPaid;
	}

	public void setDepositSumPaid(double depositSumPaid) {
		this.depositSumPaid = depositSumPaid;
	}

	
	
	
}
