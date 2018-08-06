package Clients;
import Agency.View;
import java.util.ArrayList;
import java.util.Random;
public class Buyer extends Client{
	
	private int budget;
	private ArrayList<View>views;
	
	//constructor
	public Buyer(String name, String phone) {
		super(name, phone);
		Random r=new Random();
		
		switch (r.nextInt(5)) {
		case 0:this.budget=29000;
		break;
		case 1:this.budget=35000;
		break;
		case 2:this.budget=55000;
		break;
		case 3:this.budget=170000;
		break;
		case 4:this.budget=110000;
		break;

		default:
			System.out.println("Nqma takiva pari");
			break;
		}
		this.views=new ArrayList<>();
	}
	
	//getters and setters

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public ArrayList<View> getViews() {
		return views;
	}

	public void setViews(ArrayList<View> views) {
		this.views = views;
	}
	

}
