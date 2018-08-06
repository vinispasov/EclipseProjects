
public abstract class BankProducts {
	private String name;
	private double yearInterestPercent;
	private int period;
	private double balance;
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getYearInterestPercent() {
		return yearInterestPercent;
	}
	public void setYearInterestPercent(double yearInterestPercent) {
		this.yearInterestPercent = yearInterestPercent;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
