package MusicInstruments;

public class StringsInst extends MusicInstruments {
	
	//constructor
	public StringsInst(){
		this.setType("Strings Instrument");
	}
	
	
	//Inner classes
	public class Violin extends StringsInst{
		//constructor
	   public Violin() {
		   this.setName("Violin");
		   this.setPrice(200);
	   }
		
	}
    public class Viola extends StringsInst{
    	//constructor
 	   public Viola() {
 		   this.setName("Viola");
 		   this.setPrice(180);
 	   }
	}
    public class Bass extends StringsInst{
    	//constructor
 	   public Bass() {
 		   this.setName("Bass");
 		   this.setPrice(220);
 	   }
		
	}
    public class Harp extends StringsInst{
    	//constructor
 	   public Harp() {
 		   this.setName("Harp");
 		   this.setPrice(240);
 	   }
		
	}
    public class Quitar extends StringsInst{
    	//constructor
 	   public Quitar() {
 		   this.setName("Quitar");
 		   this.setPrice(160);
 	   }
	
    }
    public class Gadulka extends StringsInst{
    	//constructor
 	   public Gadulka() {
 		   this.setName("Gadulka");
 		   this.setPrice(140);
 	   }
	
    }
    

}
