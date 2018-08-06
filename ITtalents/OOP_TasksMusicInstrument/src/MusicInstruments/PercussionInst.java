package MusicInstruments;

public class PercussionInst extends MusicInstruments {
	
	
	   //constructor
		public PercussionInst(){
			this.setType("Percussion Instrument");
		}
	
	public class Drums extends PercussionInst{
		
		//constructor
		   public Drums() {
			   this.setName("Drums");
			   this.setPrice(250);
		   }
		
	}
    public class Tarambuka extends PercussionInst{
    	//constructor
 	   public Tarambuka() {
 		   this.setName("Tarambuka");
 		   this.setPrice(100);
 	   }
		
	}
    public class Drum extends PercussionInst{
    	//constructor
 	   public Drum() {
 		   this.setName("Drum");
 		   this.setPrice(200);
 	   }
	
    }
    public class Drummer extends PercussionInst{
    	//constructor
 	   public Drummer() {
 		   this.setName("Drummer");
 		   this.setPrice(50);
 	   }
	
    }

}
