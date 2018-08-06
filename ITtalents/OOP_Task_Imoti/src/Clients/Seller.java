package Clients;

import Properties.Apartment;
import Properties.House;
import Properties.Parcel;
import Properties.Property;
import java.util.Random;
public class Seller extends Client {
	
	private Property property;
	
	//constructor
	
	public Seller(String name, String phone) {
		super(name, phone);
		
		Random r=new Random();
		switch (r.nextInt(3)) {
		case 0:this.property=new Apartment();
		this.property.setSeller(this);
	    break;
		case 1:this.property=new House();
		this.property.setSeller(this);
		break;
		case 2:this.property=new Parcel();
		this.property.setSeller(this);
		break;

		default:
			System.out.println("We do not have such a property.");
			break;
		}
		
		
	}
	
	//getters and setters

	public Property getProperty() {
		return property;
	}
	
	


}
