package Vignette;

import java.time.LocalDate;

public abstract class Vignette implements Comparable<Vignette>{
	private LocalDate issueDate;
	private String color;
	private int price;
	private int dailyPrice;
	private int montlyPrice;
	private int yearPrice;
	private LocalDate expiryDate;

	@Override
	public int compareTo(Vignette other) {
		return this.getClass().getName().compareTo(other.getClass().getName());
	}
	
	
	//getters and setters
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public int getDailyPrice() {
		return dailyPrice;
	}


	public void setDailyPrice(int dailyPrice) {
		this.dailyPrice = dailyPrice;
	}


	public int getMontlyPrice() {
		return montlyPrice;
	}


	public void setMontlyPrice(int montlyPrice) {
		this.montlyPrice = montlyPrice;
	}


	public int getYearPrice() {
		return yearPrice;
	}


	public void setYearPrice(int yearPrice) {
		this.yearPrice = yearPrice;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
