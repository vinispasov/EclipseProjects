package Agency;

import Properties.Property;
import java.time.LocalDate;
import Clients.Buyer;

public class View {
	
	private Property property;
	private Agent agent;
	private Buyer buyer;
	private LocalDate date;
	
	//constructor
	public View(Buyer buyer,Property property,Agent agent) {
		this.buyer=buyer;
		this.property=property;
		this.agent=agent;
		this.date=date.now();
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
