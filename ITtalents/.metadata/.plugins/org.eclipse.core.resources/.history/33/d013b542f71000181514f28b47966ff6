
import java.util.Iterator;
import java.util.TreeSet;
import Vignette.BusVignette;
import Vignette.CarVignette;
import Vignette.TruckVignette;
import Vignette.Vignette;
import java.util.Random;
public class FuelStation {
	private double turnoverOfDay;
	private TreeSet<Vignette>vignettes=new TreeSet<Vignette>();
	
	
	//constructor
	public FuelStation() {
	  for (int i = 0; i < 10000; i++) {
		int randomNumber=this.randomNum();
		
		switch (randomNumber) {
		case 0: 
			this.vignettes.add(new CarVignette().new DailyVignette());
			break;
		case 1:this.vignettes.add(new CarVignette().new MonthlyVignette());
		    break;
		case 2: this.vignettes.add(new CarVignette().new YearVignette());
		break;
		case 3: this.vignettes.add(new TruckVignette().new DailyVignette());
		break;
		case 4: this.vignettes.add(new TruckVignette().new MonthlyVignette());
		break;
		case 5: this.vignettes.add(new TruckVignette().new YearVignette());
		break;
		case 6: this.vignettes.add(new BusVignette().new DailyVignette());
		break;
		case 7: this.vignettes.add(new BusVignette().new MonthlyVignette());
		break;
		case 8: this.vignettes.add(new BusVignette().new YearVignette());
		break;

		default:
			break;
		}
		
	  }
	}
	
	
	//methods
	
	void sellVignette(Vignette vignette) {
		boolean isSold=false;
		for (Iterator<Vignette> iterator = vignettes.iterator(); iterator.hasNext();) {
			Vignette vinetka =iterator.next();
			if (vinetka.compareTo(vignette)==0) {
					this.turnoverOfDay+=vinetka.getPrice();
					this.vignettes.remove(vinetka);
					isSold=true;
					break;
			}
		}
		if (isSold) {
			System.out.println("Vignette is sold.");
		}
		else {
			System.out.println("We do not have such a vignette.");
		}
}
	
	private int randomNum() {
		Random r=new Random();
		return r.nextInt(9);
	}


	//getters and setters
	public TreeSet<Vignette> getVignettes() {
		return vignettes;
	}


	public void setVignettes(TreeSet<Vignette> vignettes) {
		this.vignettes = vignettes;
	}
	
	
}
