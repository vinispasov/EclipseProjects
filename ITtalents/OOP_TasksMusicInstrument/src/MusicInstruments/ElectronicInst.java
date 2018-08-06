package MusicInstruments;

public class ElectronicInst extends MusicInstruments {
	
	//constructor
	public ElectronicInst(){
		this.setType("Electronic Instrument");
	}

public class Synthesizer extends ElectronicInst{
//constructor
	   public Synthesizer() {
		   this.setName("Synthesizer");
		   this.setPrice(350);
	   }
}
public class BassQuitar extends ElectronicInst{
//constructor
 public BassQuitar() {
	   this.setName("BassQuitar");
	   this.setPrice(279.50);
 }

}
public class ElViolin extends ElectronicInst{
//constructor
 public ElViolin() {
	   this.setName("ElViolin");
	   this.setPrice(220.99);
 }

}

	

}
