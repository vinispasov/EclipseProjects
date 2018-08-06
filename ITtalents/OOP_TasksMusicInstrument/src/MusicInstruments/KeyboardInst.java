package MusicInstruments;

public class KeyboardInst extends MusicInstruments{
	
	  //constructor
			public KeyboardInst(){
				this.setType("Keyboard Instrument");
			}
	
	public class Organ extends KeyboardInst{
		//constructor
	 	   public Organ() {
	 		   this.setName("Organ");
	 		   this.setPrice(450);
	 	   }
	}
    public class Piano extends KeyboardInst{
    	//constructor
  	   public Piano() {
  		   this.setName("Piano");
  		   this.setPrice(419.50);
  	   }
		
	}
    public class Acordion extends KeyboardInst{
    	//constructor
  	   public Acordion() {
  		   this.setName("Acordion");
  		   this.setPrice(120);
  	   }
	
    }
    

}
