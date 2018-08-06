package Vignette;

public class TruckVignette extends Vignette {
	
	//constructor
		public TruckVignette(){
			this.setColor("Yellow");
		}
		
		//methods
		void glueVignette() {
			System.out.println("10 seconds");
		}
		//inner classes
		
		public class DailyVignette extends TruckVignette{
			//constructor
		   public DailyVignette(){
		    	this.setDailyPrice(7);
		    	this.setPrice(this.getDailyPrice());
		    }
		}
		
		public class MonthlyVignette extends TruckVignette{
			//constructor
			   public MonthlyVignette(){
			    	this.setMontlyPrice((7*10));
			    	this.setPrice(this.getMontlyPrice());
			    }
		}
		
		public class YearVignette extends TruckVignette{
			//constructor
			   public YearVignette(){
			    	this.setYearPrice((70*6));
			    	this.setPrice(this.getYearPrice());
			    }
		}


}
