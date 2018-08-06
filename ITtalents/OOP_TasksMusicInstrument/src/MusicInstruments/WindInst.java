package MusicInstruments;

public class WindInst extends MusicInstruments {
	
	
	
	  //constructor
	  public WindInst(){
		 this.setType("Wind Instrument");
	  }
	
	public class Trumpet extends WindInst{
		//constructor
		   public Trumpet() {
			   this.setName("Trumpet");
			   this.setPrice(100);
		   }
		
	}
    public class Trombone extends WindInst{
    	//constructor
 	   public Trombone() {
 		   this.setName("Trombone");
 		   this.setPrice(120);
 	   }
		
	}
    public class Tube extends WindInst{
    	//constructor
 	   public Tube() {
 		   this.setName("Tube");
 		   this.setPrice(140);
 	   }
		
	}
    public class Flute extends WindInst {
    	//constructor
 	   public Flute() {
 		   this.setName("Flute");
 		   this.setPrice(80);
 	   }
		
	}
    public class Clarinet extends WindInst {
    	//constructor
 	   public Clarinet() {
 		   this.setName("Clarinet");
 		   this.setPrice(100);
 	   }
		
	}

}
