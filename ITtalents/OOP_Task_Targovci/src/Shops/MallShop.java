package Shops;

public class MallShop extends CommercialSite{

	public MallShop(String addres, String workingHours, int area) {
		super(addres, workingHours, area);
		this.tax=150;
	}

}
