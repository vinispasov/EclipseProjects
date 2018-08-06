
public class Carshop {
	static private Car[]cars;
	static private int counterAddCar=0; 
	static private int counterNextCar=-1; 
	//constructors
	
	Carshop(int capacity){
		this.cars=new Car[capacity];
	}

	//methods
    static boolean addCar(Car car) {
    	if (car.getYear()==0) {
			return false;
		}
    	else {
    	cars[counterAddCar]=car;
    	counterAddCar++;
    	return true;
    	}
    }
    static Car getNextCar() {
    	counterNextCar++;
    	return cars[counterNextCar];
    }
    static Car getThisCar() {
    	return cars[counterNextCar];
    }
    static void sellNextCar(Person buyer) {
    	if (cars[counterNextCar]==null) {
		 System.out.println("Car was sold,earlier.");
		}
    	if (cars[counterNextCar].getPrice()<=buyer.getMoney()&&buyer.getAge()>=18) {
    		removeCar(cars[counterNextCar]);
			System.out.println("Car sold to "+buyer.getName());
		}
    	else {
    		if (buyer.getAge()<18) {
			System.out.println(buyer.getName()+" doesn't have age for buying a car!");	
			}
    		else if (buyer.getMoney()<cars[counterNextCar].getPrice()){
			System.out.println(buyer.getName()+" doesn't have enough money to buy this car.");
    		}
		}
    		
    }
    static boolean removeCar(Car car) {
    	cars[counterNextCar]=null;
    	return true;
    }
    
    static void showAllCarsInTheShop() {
    	for (int i = 0; i < cars.length; i++) {
    		if (cars[i]==null) {
				continue;
			}
			System.out.print(cars[i].model+", ");
			System.out.print(cars[i].getPrice()+", ");
			System.out.println(cars[i].getYear());
    		
		}
    }

}
