import Vignette.CarVignette;
import Vignette.Vignette;
public class Demo {
	public static void main(String[] args) {
		
		
		Vehicle kamion=new Truck("Kamaz",1980);
		Vehicle kola=new Car("Ford",2000);
		Vehicle bus=new Bus("79",1950);
		
		 FuelStation omv=new FuelStation();
	   Driver pesho=new Driver("Pesho",300,omv);
	   pesho.getVehicles().add(bus);
	   pesho.getVehicles().add(kola);
	   pesho.getVehicles().add(kamion);
	   
	   
	   
	  
	    
		
		
		
		
	}

}
