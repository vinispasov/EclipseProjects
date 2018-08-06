package Vignette;

public class CarVignette extends Vignette   {
	 
	//constructor
	public CarVignette(){
		this.setColor("Blue");
	}
	
	//methods
	void glueVignette() {
		System.out.println("5 seconds");
	}
	
	//inner classes
	
	public class DailyVignette extends CarVignette{
		//constructor
	   public DailyVignette(){
	    	this.setDailyPrice(5);
	    	this.setPrice(this.getDailyPrice());
	    }
	}
	
	public class MonthlyVignette extends CarVignette{
		//constructor
		   public MonthlyVignette(){
		    	this.setMontlyPrice((5*10));
		    	this.setPrice(this.getMontlyPrice());
		    }
	}
	
	public class YearVignette extends CarVignette{
		//constructor
		   public YearVignette(){
		    	this.setYearPrice((50*6));
		    	this.setPrice(this.getYearPrice());
		    }
	}
	
	
	
	

}
