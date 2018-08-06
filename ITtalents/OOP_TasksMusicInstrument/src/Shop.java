import MusicInstruments.ElectronicInst;
import MusicInstruments.KeyboardInst;
import MusicInstruments.MusicInstruments;
import MusicInstruments.PercussionInst;
import MusicInstruments.StringsInst;
import MusicInstruments.WindInst;

import java.util.ArrayList;
public class Shop {
	
	private String name;
	private double cashDesk;
	private ArrayList<MusicInstruments> musicInst=new ArrayList();
	
	public Shop(String name) {
		if (name==""||name.isEmpty()) {
			System.out.println("Incorrect name");
		}
		else {
		    this.name=name;
		}
		this.musicInst.add(new StringsInst().new Bass());
		this.musicInst.add(new StringsInst().new Gadulka());
		this.musicInst.add(new StringsInst().new Harp());
		this.musicInst.add(new StringsInst().new Quitar());
		this.musicInst.add(new StringsInst().new Viola());
		this.musicInst.add(new StringsInst().new Violin());
		this.musicInst.add(new PercussionInst().new Tarambuka());
		this.musicInst.add(new PercussionInst().new Drum());
		this.musicInst.add(new PercussionInst().new Drums());
		this.musicInst.add(new PercussionInst().new Drummer());
		this.musicInst.add(new WindInst().new Trumpet());
		this.musicInst.add(new WindInst().new Trombone());
		this.musicInst.add(new WindInst().new Tube());
		this.musicInst.add(new WindInst().new Flute());
		this.musicInst.add(new WindInst().new Clarinet());
		this.musicInst.add(new KeyboardInst().new Organ());
		this.musicInst.add(new KeyboardInst().new Piano());
		this.musicInst.add(new KeyboardInst().new Acordion());
		this.musicInst.add(new ElectronicInst().new Synthesizer());
		this.musicInst.add(new ElectronicInst().new BassQuitar());
		this.musicInst.add(new ElectronicInst().new ElViolin());
	
	}
	//methods
	
	void sellInstrument(String name, int amount) {
		boolean isCorrectName=false;
		for (int i = 0; i <this.musicInst.size(); i++) {
		 if (this.musicInst.get(i).getName()==name
				 &&this.musicInst.get(i).isInStock()) {
			  
			 isCorrectName=true;
	
			if (this.musicInst.get(i).getStock()>amount) {
				this.musicInst.get(i).setStock(this.musicInst.get(i).getStock()-amount);
				cashDesk+=(this.musicInst.get(i).getPrice()*amount);
				System.out.println(amount+" "+this.musicInst.get(i).getName()+ " sold for "+this.musicInst.get(i).getPrice()*amount);
			}
			else if (this.musicInst.get(i).getStock()<amount) {
				System.out.println("Only "+this.musicInst.get(i).getStock()+" of "+this.musicInst.get(i).getName()+" we have now.You can wait to get in stock.");
				
				loadShop(name,amount);
				cashDesk+=(this.musicInst.get(i).getPrice()*amount);
				System.out.println(amount+" "+this.musicInst.get(i).getName()+ " sold for "+this.musicInst.get(i).getPrice()*amount);
			}
			else {
				System.out.println("For good luck, we have exactly "+amount+" of "+this.musicInst.get(i).getName());
				cashDesk+=(this.musicInst.get(i).getPrice()*amount);
				System.out.println(amount+" "+this.musicInst.get(i).getName()+ " sold for "+this.musicInst.get(i).getPrice()*amount);
				this.musicInst.get(i).setStock(0);
				this.musicInst.get(i).setInStock(false);
				loadShop(name,3);
				System.out.println("We have load the shop.");
				
			}
			break;
		 }
		 
	  }
		if (!isCorrectName) {
			System.out.println("We don't sell this kind of stuffs like "+name+". Sorry!");
		}
  }
	
	void loadShop(String name,int amount) {
		for (int i = 0; i < this.musicInst.size(); i++) {
			if (this.musicInst.get(i).getName()==name) {
				this.musicInst.get(i).setStock(amount);
				this.musicInst.get(i).setInStock(true);
				break;
			}
		}
	}
	
	
	
	//getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<MusicInstruments> getMusicInst() {
		return musicInst;
	}


}
