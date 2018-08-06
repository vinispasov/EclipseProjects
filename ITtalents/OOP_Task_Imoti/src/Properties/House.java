package Properties;

import java.util.Random;

enum TypeHouse{
	FLOOR, HOUSE
}

public class House extends Property {
	private String constructionType;
	
	//constructor
	public House() {
		Random r=new Random();
		switch (r.nextInt(3)) {
		case 0:
			this.setPrice(50000);
		    this.setArea(0.3);
		break;
		case 1:
			this.setPrice(70000);
			this.setArea(0.5);
		break;
		case 2:
			this.setPrice(77000);
			this.setArea(0.7);
			break;
		default:
			System.out.println("Ne stava s tiya pari");
			break;
		}
	}

}
