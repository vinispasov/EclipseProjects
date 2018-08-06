package Properties;

import Agency.Agent;
import Clients.Seller;

import java.util.Random;
public abstract class Property {
	
	private String description;
	private String addres;
	private int price;
	private double area;
	private Agent agent;
	private Seller seller;
	private static final int COUNTER=1;
	
	//constructor
	
	public Property() {
		this.description=COUNTER+"";
		this.addres=COUNTER+"";
	}
	
	//getters and setters

	public int getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	

}
