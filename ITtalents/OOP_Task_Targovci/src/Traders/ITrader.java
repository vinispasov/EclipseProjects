package Traders;


import Couriers.RetailCourier;

public interface ITrader {
	
	void makeOrder(RetailCourier c,String product);
	void getTurnover();
	
}
