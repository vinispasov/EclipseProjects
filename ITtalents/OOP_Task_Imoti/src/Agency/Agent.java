package Agency;
import Clients.Seller;
import Clients.Buyer;
import java.util.HashSet;
import java.util.HashMap;

public class Agent {
	private String name;
	private String phone;
	private double payment;
	private HashSet<Seller> sellers;
	private HashSet<Buyer> buyers;
	private HashMap<Buyer,View> views;
	
	
	//constructor
	public Agent(String name,String phone) {
		this.name=name;
		this.phone=phone;
		sellers=new HashSet<Seller>();
		buyers=new HashSet<Buyer>();
		views=new HashMap<Buyer,View>();
	}

	//getters and setters

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public HashSet<Seller> getSellers() {
		return sellers;
	}


	public void setSellers(HashSet<Seller> sellers) {
		this.sellers = sellers;
	}


	public HashSet<Buyer> getBuyers() {
		return buyers;
	}


	public void setBuyers(HashSet<Buyer> buyers) {
		this.buyers = buyers;
	}


	public HashMap<Buyer, View> getViews() {
		return views;
	}


	public void setViews(HashMap<Buyer, View> views) {
		this.views = views;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment += payment;
	}

}
