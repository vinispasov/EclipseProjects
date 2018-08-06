package Traders;

import java.util.HashMap;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.DecimalFormat;

import Couriers.Courier;
import Couriers.RetailCourier;

public class Peddler extends Trader implements ITrader{
	
	private Courier courier;
	private HashMap<String,Double>products;

	public Peddler(String name, String addres, int money, RetailCourier courier) {
		super(name, addres, money);
		this.courier=courier;
		this.products=new HashMap<String,Double>();
	}

	
	@Override
	public void makeOrder(RetailCourier c,String product) {
		double sum=0;
		DecimalFormat d = new DecimalFormat("#.##");
		for (int i = 0; i <1; i++) {
			
			if (c.getProducts().containsKey(product)&&c.getProducts().get(product)<=this.getMoney()/2) {
				sum+=c.getProducts().get(product);
				this.products.put(product, c.getProducts().get(product));
				this.setMoney(this.getMoney()-c.getProducts().get(product));
				System.out.println("Sum: "+d.format(sum));
			}
			else {
				if (c.getProducts().containsKey(product)) {
					System.out.println("Doesn't have enough money.");
				}
				else {
				System.out.println("Doesn't have such a product");
				}
			}
		}
		
	}


	@Override
	public void getTurnover() {
		int r=random(3);
		System.out.println("money before: "+this.getMoney());
		switch (r) {
		case 0:
			this.setMoney(this.getMoney()
				+(this.products.get("Meso")*1.3)
				+(this.products.get("Domati")*1.3)
				+(this.products.get("Krastavici")*1.3));
			
			   this.products.remove("Meso");
		       this.products.remove("Domati");
		       this.products.remove("Krastavici");
			break;
		case 1:
			this.setMoney(this.getMoney()
				+(this.products.get("Meso")*1.3)
				+(this.products.get("Konservi")*1.3)
				+(this.products.get("Riba")*1.3));
			
			   this.products.remove("Meso");
	           this.products.remove("Konservi");
	           this.products.remove("Riba");
	           break;
		case 2:this.setMoney(this.getMoney()
				+(this.products.get("Domati")*1.3)
				+(this.products.get("Podpravki")*1.3)
				+(this.products.get("Yabulki")*1.3));
			
			   this.products.remove("Domati");
               this.products.remove("Podpravki");
               this.products.remove("Yabulki");
               break;

		default:
			break;
		}
		
		
		System.out.println("money after: "+this.getMoney());
		
	}
	
	
	
	public int random(int n) {
		Random r=new Random();
		return r.nextInt(n);
	}

}
