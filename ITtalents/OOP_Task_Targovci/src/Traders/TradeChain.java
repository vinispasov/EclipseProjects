package Traders;
import java.util.ArrayList;
import java.text.DecimalFormat;

import Couriers.Courier;
import Shops.StreetKiosk;
import Shops.MallShop;
public class TradeChain extends Trader{
	
	private ArrayList<StreetKiosk> kiosks;
	private ArrayList<MallShop> shops;
	private ArrayList<Courier> couriers;
	
	public TradeChain(String name, String addres, int money) {
		super(name, addres, money);
		this.couriers=new ArrayList();
		this.kiosks=new ArrayList();
		this.shops=new ArrayList();
	}
	

    public void makeOrder(Courier c,String product) {
    	double sum=0;
    	DecimalFormat d = new DecimalFormat("#.##");
		for (int i = 0; i <1; i++) {
			
			if (c.getClass().getName().equals("Couriers.WholeSaleCourier")) {
			if (c.getProducts().containsKey(product)&&c.getProducts().get(product)<=this.getMoney()/2) {
				this.kiosks.get(i).getProducts().put(product,c.getProducts().get(product));
				this.shops.get(i).getProducts().put(product, c.getProducts().get(product));
				sum+=c.getProducts().get(product)-c.getProducts().get(product)*0.15;
				this.setMoney(this.getMoney()-c.getProducts().get(product)-c.getProducts().get(product)*0.15);
				System.out.println("Sum: "+d.format(sum));
				sum+=c.getProducts().get(product)-c.getProducts().get(product)*0.15;
				this.setMoney(this.getMoney()-c.getProducts().get(product)-c.getProducts().get(product)*0.15);
				System.out.println("Sum: "+d.format(sum));
			}
			else {
				if (c.getProducts().containsKey(product)) {
					System.out.println("Doesn't have enough money.");
				}
				else {
				System.out.println("Don't have such a product");
				}
			}
			}
			else {
				if (c.getProducts().containsKey(product)&&c.getProducts().get(product)<=this.getMoney()/2) {
					this.kiosks.get(i).getProducts().put(product,c.getProducts().get(product));
					this.shops.get(i).getProducts().put(product, c.getProducts().get(product));
					sum+=c.getProducts().get(product);
					this.setMoney(this.getMoney()-c.getProducts().get(product));
					System.out.println("Sum: "+d.format(sum));
					sum+=c.getProducts().get(product);
					this.setMoney(this.getMoney()-c.getProducts().get(product));
					System.out.println("Sum: "+d.format(sum));
				}
				else {
					if (c.getProducts().containsKey(product)) {
						System.out.println("Doesn't have enough money.");
					}
					else {
					System.out.println("Don't have such a product");
					}
				}
			}
		}
	}
    
   
	
    public void payTax() {
    	DecimalFormat d=new DecimalFormat();
		System.out.println("money before Tax: "+d.format(this.getMoney()));
		for (int j = 0; j < this.kiosks.size(); j++) {
		this.setMoney(this.getMoney()-this.getKiosks().get(j).getTax());
		}
		for (int j = 0; j < this.shops.size(); j++) {
			this.setMoney(this.getMoney()-this.getShops().get(j).getTax());
			}
		System.out.println("money after Tax: "+d.format(this.getMoney()));
	}

	public ArrayList<Courier> getCouriers() {
		return couriers;
	}

	public void setCouriers(ArrayList<Courier> couriers) {
		this.couriers = couriers;
	}

	public ArrayList<StreetKiosk> getKiosks() {
		return kiosks;
	}

	public void setKiosks(ArrayList<StreetKiosk> kiosks) {
		this.kiosks = kiosks;
	}

	public ArrayList<MallShop> getShops() {
		return shops;
	}

	public void setShops(ArrayList<MallShop> shops) {
		this.shops = shops;
	}
	
	
	

}
