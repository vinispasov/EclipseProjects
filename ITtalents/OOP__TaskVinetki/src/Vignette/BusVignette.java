package Vignette;

public class BusVignette extends Vignette{
	
	//constructor
		public BusVignette(){
			this.setColor("Green");
		}
		
		//methods
		void glueVignette() {
			System.out.println("20 seconds");
		}
		
		//inner classes
		public class DailyVignette extends BusVignette{
			//constructor
		   public DailyVignette(){
		    	this.setDailyPrice(9);
		    	this.setPrice(this.getDailyPrice());
		    }
		}
		
		public class MonthlyVignette extends BusVignette{
			//constructor
			   public MonthlyVignette(){
			    	this.setMontlyPrice((9*10));
			    	this.setPrice(this.getMontlyPrice());
			    }
		}
		
		public class YearVignette extends BusVignette{
			//constructor
			   public YearVignette(){
			    	this.setYearPrice((90*6));
			    	this.setPrice(this.getYearPrice());
			    }
		}


}
