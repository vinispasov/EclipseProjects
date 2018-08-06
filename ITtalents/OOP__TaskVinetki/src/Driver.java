import java.util.ArrayList;
import java.util.Iterator;
import Vignette.Vignette;
import Vignette.CarVignette;
import java.time.LocalDate;
import java.time.Period;
public class Driver {
	private String name;
	private ArrayList<Vehicle> vehicles;
	private int money;
	private FuelStation station;
	
	//constructor
	public Driver(String name,int money,FuelStation station) {
		this.name=name;
		this.vehicles=new ArrayList<Vehicle>();
		this.money=money;
		this.station=station;
	}
	
	//methods
	
	void buyVignetteForAll(String period){
		
		period=period.toLowerCase();
		for (int i = 0; i < this.vehicles.size(); i++) {
			
			if (this.vehicles.get(i).getClass().getName().equals("Car")) {
				
				if (period.equals("day")) {
				
					for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
						Vignette vinetka = iterator.next();
						
						if (this.money>=vinetka.getDailyPrice()) {
							
							this.vehicles.get(i).setVignette(vinetka);
							LocalDate issueDate=LocalDate.now();
							LocalDate expiryDate=issueDate.plusDays(1);
							this.vehicles.get(i).getVignette().setIssueDate(issueDate);
							this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
							this.money-=vinetka.getDailyPrice();
							this.station.sellVignette(vinetka);
							this.vehicles.get(i).setGluedVignette(true);
							System.out.println(this.name+" has glued daily vignette on "+this.vehicles.get(i).getModel());
							break;
						}
						else {
							System.out.println(this.name+" doesn't have enough money.");
							break;
						}
					}
					
					
				}
				else if (period.equals("month")) {
						
						for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
							Vignette vinetka = iterator.next();
							
							if (this.money>=vinetka.getMontlyPrice()) {
								
								this.vehicles.get(i).setVignette(vinetka);
								LocalDate issueDate=LocalDate.now();
								LocalDate expiryDate=issueDate.plusMonths(1);
								this.vehicles.get(i).getVignette().setIssueDate(issueDate);
								this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
								this.money-=vinetka.getMontlyPrice();
								this.station.sellVignette(vinetka);
								this.vehicles.get(i).setGluedVignette(true);
								System.out.println(this.name+" has glued monthly vignette on "+this.vehicles.get(i).getModel());
								break;
							}
							else {
								System.out.println(this.name+" doesn't have enough money.");
								break;
							}
						}
				}
				else if (period.equals("year")) {
					for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
						Vignette vinetka = iterator.next();
						
						if (this.money>=vinetka.getYearPrice()) {
							
							this.vehicles.get(i).setVignette(vinetka);
							LocalDate issueDate=LocalDate.now();
							LocalDate expiryDate=issueDate.plusYears(1);
							this.vehicles.get(i).getVignette().setIssueDate(issueDate);
							this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
							this.money-=vinetka.getYearPrice();
							this.station.sellVignette(vinetka);
							this.vehicles.get(i).setGluedVignette(true);
							System.out.println(this.name+" has glued year vignette on "+this.vehicles.get(i).getModel());
							break;
						}
						else {
							System.out.println(this.name+" doesn't have enough money.");
							break;
						}
					}
				}
				else {
					System.out.println("Invalid period entered!Try again.");
				}
				
			}
			
			if (this.vehicles.get(i).getClass().getName().equals("Truck")) {
				if (period.equals("day")) {
					
					for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
						Vignette vinetka = iterator.next();
						
						if (this.money>=vinetka.getDailyPrice()) {
							
							this.vehicles.get(i).setVignette(vinetka);
							LocalDate issueDate=LocalDate.now();
							LocalDate expiryDate=issueDate.plusDays(1);
							this.vehicles.get(i).getVignette().setIssueDate(issueDate);
							this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
							this.money-=vinetka.getDailyPrice();
							this.station.sellVignette(vinetka);
							this.vehicles.get(i).setGluedVignette(true);
							System.out.println(this.name+" has glued daily vignette on "+this.vehicles.get(i).getModel());
							break;
						}
						else {
							System.out.println(this.name+" doesn't have enough money.");
							break;
						}
					}
					
					
				}
				else if (period.equals("month")) {
						
						for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
							Vignette vinetka = iterator.next();
							
							if (this.money>=vinetka.getMontlyPrice()) {
								
								this.vehicles.get(i).setVignette(vinetka);
								LocalDate issueDate=LocalDate.now();
								LocalDate expiryDate=issueDate.plusMonths(1);
								this.vehicles.get(i).getVignette().setIssueDate(issueDate);
								this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
								this.money-=vinetka.getMontlyPrice();
								this.station.sellVignette(vinetka);
								this.vehicles.get(i).setGluedVignette(true);
								System.out.println(this.name+" has glued monthly vignette on "+this.vehicles.get(i).getModel());
								break;
							}
							else {
								System.out.println(this.name+" doesn't have enough money.");
								break;
							}
						}
				}
				else if (period.equals("year")) {
					for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
						Vignette vinetka = iterator.next();
						
						if (this.money>=vinetka.getYearPrice()) {
							
							this.vehicles.get(i).setVignette(vinetka);
							LocalDate issueDate=LocalDate.now();
							LocalDate expiryDate=issueDate.plusYears(1);
							this.vehicles.get(i).getVignette().setIssueDate(issueDate);
							this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
							this.money-=vinetka.getYearPrice();
							this.station.sellVignette(vinetka);
							this.vehicles.get(i).setGluedVignette(true);
							System.out.println(this.name+" has glued year vignette on "+this.vehicles.get(i).getModel());
							break;
						}
						else {
							System.out.println(this.name+" doesn't have enough money.");
							break;
						}
					}
				}
				else {
					System.out.println("Invalid period entered!Try again.");
				}
				
			}
			
			if (this.vehicles.get(i).getClass().getName().equals("Bus")) {
				if (period.equals("day")) {
					
					for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
						Vignette vinetka = iterator.next();
						
						if (this.money>=vinetka.getDailyPrice()) {
							
							this.vehicles.get(i).setVignette(vinetka);
							LocalDate issueDate=LocalDate.now();
							LocalDate expiryDate=issueDate.plusDays(1);
							this.vehicles.get(i).getVignette().setIssueDate(issueDate);
							this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
							this.money-=vinetka.getDailyPrice();
							this.station.sellVignette(vinetka);
							this.vehicles.get(i).setGluedVignette(true);
							System.out.println(this.name+" has glued daily vignette on "+this.vehicles.get(i).getModel());
							break;
						}
						else {
							System.out.println(this.name+" doesn't have enough money.");
							break;
						}
					}
					
					
				}
				else if (period.equals("month")) {
						
						for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
							Vignette vinetka = iterator.next();
							
							if (this.money>=vinetka.getMontlyPrice()) {
								
								this.vehicles.get(i).setVignette(vinetka);
								LocalDate issueDate=LocalDate.now();
								LocalDate expiryDate=issueDate.plusMonths(1);
								this.vehicles.get(i).getVignette().setIssueDate(issueDate);
								this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
								this.money-=vinetka.getMontlyPrice();
								this.station.sellVignette(vinetka);
								this.vehicles.get(i).setGluedVignette(true);
								System.out.println(this.name+" has glued monthly vignette on "+this.vehicles.get(i).getModel());
								break;
							}
							else {
								System.out.println(this.name+" doesn't have enough money.");
								break;
							}
						}
				}
				else if (period.equals("year")) {
					for (Iterator<Vignette> iterator = this.station.getVignettes().iterator(); iterator.hasNext();) {
						Vignette vinetka = iterator.next();
						
						if (this.money>=vinetka.getYearPrice()) {
							
							this.vehicles.get(i).setVignette(vinetka);
							LocalDate issueDate=LocalDate.now();
							LocalDate expiryDate=issueDate.plusYears(1);
							this.vehicles.get(i).getVignette().setIssueDate(issueDate);
							this.vehicles.get(i).getVignette().setExpiryDate(expiryDate);
							this.money-=vinetka.getYearPrice();
							this.station.sellVignette(vinetka);
							this.vehicles.get(i).setGluedVignette(true);
							System.out.println(this.name+" has glued year vignette on "+this.vehicles.get(i).getModel());
							break;
						}
						else {
							System.out.println(this.name+" doesn't have enough money.");
							break;
						}
					}
				}
				else {
					System.out.println("Invalid period entered!Try again.");
				}
				
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public FuelStation getStation() {
		return station;
	}

	public void setStation(FuelStation station) {
		this.station = station;
	}
	
	

}
