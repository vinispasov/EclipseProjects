
public class Car {
	public String model;
	private int year;
	private int price;
	
	//constructors
	Car(String model,int year,int price){
		setModel(model);
		setYear(year);
		setPrice(price);
	}
	
	//setters
	public void setModel(String model) {
		if (model!="") {
			this.model=model;
		}
		else {
			System.out.println("Invalid model!");
		}			
	}
	public void setYear(int year) {
		if (year>=2010) {
			this.year=year;
		}
		else {
			System.out.println("We Do not have cars older than 2010 year.");
		}
	}
	public void setPrice(int price) {
		if (price>=0) {
			this.price=price;
		}
		else {
			System.out.println("Invalid price entered!");
		}
	}
	
	//getters
	
	public int getYear(){
		return this.year;
	}
	public int getPrice(){
		return this.price;
	}
	

}
