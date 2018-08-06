package Agency;
import java.util.ArrayList;
import Properties.Property;
import java.util.Random;

import Clients.Buyer;
import Clients.Seller;

public class Agency {
	
	private String name;
	private double budget;
	private String addres;
	private String phone;
	private ArrayList<Agent>agents;
	private ArrayList<Property> properties;
	
	//constructor
	public Agency(String name,String addres,String phone, int agents){
		this.name=name;
		this.addres=addres;
		this.phone=phone;
		this.agents=new ArrayList<Agent>();
		for (int i = 0; i < agents; i++) {
			this.agents.add(new Agent(i+1+"",i+1000+""));
		}
		this.properties=new ArrayList<Property>();
		this.budget=0.0;
	}
	

	//methods
	
	public void registerProperty(Seller seller,Property property) {
		Random r=new Random();
		int agentIdx=r.nextInt(this.agents.size());
		property.setAgent(this.agents.get(agentIdx));
		System.out.println("Agent "+property.getAgent().getName()+" is agent on property "+property.getDescription());
		this.agents.get(agentIdx).getSellers().add(seller);
		System.out.println(seller.getName()+" was added as a seller on agent sheet.");
		this.properties.add(property);
		System.out.println("Property "+property.getDescription()+" was added on property catalogue.");
	}
	
		public void searchForProperty(Buyer buyer) {
			Random r=new Random();
			int agentIdx=r.nextInt(this.agents.size());
			this.agents.get(agentIdx).getBuyers().add(buyer);
			System.out.println(buyer.getName()+" was added on the sheet of agent "+this.agents.get(agentIdx).getName());
		}
		
		public void requestView(Buyer buyer, Property property,Agent agent) {
			
			if (buyer.getBudget()>property.getPrice()) {
				View newView=new View(buyer,property,agent);
				buyer.getViews().add(newView);
				agent.getViews().put(buyer,newView);
				System.out.println("View was made on "+newView.getDate());
				
			}
			else {
				System.out.println("Buyer "+buyer.getName()+" doesn't have enough money for this property.");
			}
			System.out.println();
		}
		
		public void buyProperty(Buyer buyer,View view) {
			Random r=new Random();
			int randomIdx=r.nextInt(3);
			Property property= view.getProperty();
			this.budget+=(property.getPrice()*0.03);
			property.getAgent().setPayment(property.getPrice()*0.03);
		}
	
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<Agent> getAgents() {
		return agents;
	}

	public void setAgents(ArrayList<Agent> agents) {
		this.agents = agents;
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Property> properties) {
		this.properties = properties;
	}


	public double getBudget() {
		return budget;
	}


	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	

}
