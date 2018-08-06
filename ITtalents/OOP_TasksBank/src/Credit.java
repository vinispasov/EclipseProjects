
public class Credit extends BankProducts {
	private int creditSumImport;
	private Credit homeCredit;
	private Credit consumerCredit;
	
	Credit(int periodMonths){
		this.homeCredit.setPeriod(periodMonths);
		this.consumerCredit.setPeriod(periodMonths);
		this.homeCredit.setYearInterestPercent(0.06);
		this.consumerCredit.setYearInterestPercent(0.1);
	}
	
	
	//getters and setters
	public int getCreditSumImport() {
		return creditSumImport;
	}

	public void setCreditSumImport(int creditSumImport) {
		this.creditSumImport = creditSumImport;
	}

	public Credit getHomeCredit() {
		return homeCredit;
	}

	public void setHomeCredit(Credit homeCredit) {
		this.homeCredit = homeCredit;
	}

	public Credit getConsumerCredit() {
		return consumerCredit;
	}

	public void setConsumerCredit(Credit consumerCredit) {
		this.consumerCredit = consumerCredit;
	}
}
