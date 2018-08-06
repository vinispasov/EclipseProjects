package superheroesUniverse.SuperheroesUniverse;

import java.util.Iterator;

public class main {
	
		public static void main(String[] args) {
			
		Superhero batman=new Superhero("Batman","001",Aligment.GOOD,100,PowerType.CHEMICHAL,"Strong",PowerType.TECH);
		Superhero spinderman=new Superhero("Spiderman","002",Aligment.GOOD,100,PowerType.TECH,"Flexible",PowerType.MAGIC);
		
		batman.addPower("Magic", PowerType.MAGIC);
		batman.addPower("chemical",PowerType.CHEMICHAL);
	    spinderman.addPower("Chemical", PowerType.CHEMICHAL);
	    spinderman.addPower("Intelligence", PowerType.INTELLECT);
	    batman.addImmunity(PowerType.INTELLECT);
	  
		batman.attack(spinderman);
	   
	
	}

}
