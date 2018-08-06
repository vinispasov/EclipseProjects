package Properties;

import java.util.Random;

enum TypeApartment{
	ATELIER,STUDIO,TWO_ROOM_APARTMENT,THREE_ROOM_APARTMENT,MAISONETTE
}

public class Apartment extends Property{
	private String constructionType;
	
	
	//constructor
	public Apartment() {
		
		Random r=new Random();
		switch (r.nextInt(3)) {
		case 0:
			this.setPrice(70000);
		    this.setArea(0.1);
		break;
		case 1:
			this.setPrice(110000);
			this.setArea(0.3);
		break;
		case 2:
			this.setPrice(150000);
			this.setArea(0.5);
			break;
		default:
			System.out.println("Ne stava s tiya pari");
			break;
		}
		this.constructionType="Some";
	}

}
