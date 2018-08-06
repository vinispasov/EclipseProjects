package Shops;
import java.util.HashMap;
public abstract class CommercialSite {
	private String addres;
	private String workingHours;
	private int area;
	protected int tax;
	private HashMap<String,Double> products;
	
	public CommercialSite(String addres, String workingHours, int area) {
		this.addres = addres;
		this.workingHours = workingHours;
		this.area = area;
		this.products=new HashMap<String,Double>();
	}

	public HashMap<String, Double> getProducts() {
		return products;
	}

	public void setProducts(HashMap<String, Double> products) {
		this.products = products;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
	

}
