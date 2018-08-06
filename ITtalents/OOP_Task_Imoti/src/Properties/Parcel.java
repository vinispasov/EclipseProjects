package Properties;
import java.util.Random;
enum TypeParcels{
	CORNFIELD,WOOD,MEADOW
}
public class Parcel extends Property{
	private boolean isRegulated;
	
	//constructor
	public Parcel() {
		Random r=new Random();
		switch (r.nextInt(3)) {
		case 0:
			this.setPrice(30000);
		    this.setArea(0.5);
		break;
		case 1:
			this.setPrice(50000);
			this.setArea(1);
		break;
		case 2:
			this.setPrice(85000);
			this.setArea(3.5);
			break;
		default:
			System.out.println("Ne stava s tiya pari");
			break;
		}
		this.isRegulated=false;
	}
	

}
