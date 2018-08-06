package Traders;

import Couriers.Courier;

public abstract class Trader {
	private String name;
	private String addres;
	private double money;
	
	//constructor
	public Trader(String name, String addres, double money) {
		this.name = name;
		this.addres = addres;
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	
	
	
	

}
