package superheroesUniverse.SuperheroesUniverse;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
enum Aligment{
	GOOD,EVIL,NEUTRAL;
}
public class Superhero {
	private static final int LIFE_POINTS_TAKEN_ON_ATTACK = 10;
	private static final int MIN_NAME_LENGTH = 3;
	private String name;
	private String secretId;
	private Aligment aligment;
	private int life;
	private HashSet<PowerType>immunities;
	private HashSet<Powers>powers;
	private static int counter=1;
	private static Superhero attacker;
	private static Superhero defender;
	
	
	public HashSet<Powers> getPowers() {
		return powers;
	}

	public void setPowers(HashSet<Powers> powers) {
		this.powers = powers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length()<MIN_NAME_LENGTH) {
			System.out.println("The name of hero should contain at least 3 digits");
			System.out.println("Try again here: ");
			Scanner sc=new Scanner(System.in);
			while(true) {
				String input=sc.nextLine();
				if (input.length()>=MIN_NAME_LENGTH) {
					break;
				}
				else {
					System.out.println("Invalid input.Try again.");
				}
			}
		}
		this.name = name;
	}

	public String getSecretId() {
		return secretId;
	}

	public void setSecretId(String secretId) {
		if (secretId.length()<3) {
			System.out.println("The secret Id of hero should contain at least 3 digits");
			System.out.println("Try again here: ");
			Scanner sc=new Scanner(System.in);
			while(true) {
				String input=sc.nextLine();
				if (input.length()>=3) {
					break;
				}
				else {
					System.out.println("Invalid input.Try again.");
				}
			}
		}
		this.secretId = secretId;
	}

	public Aligment getAligment() {
		return aligment;
	}

	public void setAligment(Aligment aligment) {
		this.aligment = aligment;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		if (life<0||life>100) {
			System.out.println("The life of hero should be between 0 and 100.");
			System.out.println("Try again here: ");
			Scanner sc=new Scanner(System.in);
			while(true) {
				int input=sc.nextInt();
				if (input>=0||input<=100) {
					break;
				}
				else {
					System.out.println("Invalid input.Try again.");
				}
			}
		}
		this.life = life;
	}

	public HashSet<PowerType> getImmunities() {
		return immunities;
	}

	public void setImmunities(HashSet<PowerType> immunities) {
		this.immunities = immunities;
	}

	public Superhero(String name, String secretId, Aligment aligment, int life, PowerType immunity,String nameOfPower,PowerType powerType) {
		
	    setName(name);
		setSecretId(secretId);
		setAligment(aligment);
		setLife(life);
		this.immunities=new HashSet<PowerType>();
		this.immunities.add(immunity);
		this.powers=new HashSet<Powers>();
		Powers power=new Powers(nameOfPower,powerType);
		this.powers.add(power);
	}
	
    void addImmunity(PowerType immunity){
    	this.immunities.add(immunity);
    }
    void addPower(String name,PowerType powerType){
    	Powers power=new Powers(name,powerType);
    	this.powers.add(power);    
    }
    
    void attack(Superhero superhero) {
    
    	while (this.life>0||superhero.life>0) {
			
    	boolean hasImmunity=false;
    	
    	if (counter==1) {
			attacker=this;
			defender=superhero;
    	
    	for (Iterator iterator = attacker.powers.iterator(); iterator.hasNext();) {
			Powers power = (Powers) iterator.next();
			for (Iterator iterator2 = defender.immunities.iterator(); iterator2.hasNext();) {
				PowerType powerType = (PowerType) iterator2.next();
				if (power.getPowerType().equals(powerType)) {
					hasImmunity=true;
					System.out.println(defender.getName()+" has a immunity of power type: "+powerType);
					break;
				}
			}
			if (!hasImmunity) {
				defender.setLife(defender.getLife()-LIFE_POINTS_TAKEN_ON_ATTACK);
				System.out.println(attacker.name+" wounds "+defender.name+" and now he has "+defender.life+"% of life.");
			}
			if (defender.life<=0) {
				break;
			}
					
		}
    	counter=2;
		}
    	
    	
    	else {
    		attacker=superhero;
			defender=this;

	    	for (Iterator iterator = attacker.powers.iterator(); iterator.hasNext();) {
				Powers power = (Powers) iterator.next();
				for (Iterator iterator2 = defender.immunities.iterator(); iterator2.hasNext();) {
					PowerType powerType = (PowerType) iterator2.next();
					if (power.getPowerType().equals(powerType)) {
						hasImmunity=true;
						System.out.println(defender.getName()+" has a immunity of power type: "+powerType);
						break;
					}
				}
				if (!hasImmunity) {
					defender.setLife(defender.getLife()-LIFE_POINTS_TAKEN_ON_ATTACK);
					System.out.println(attacker.name+" wounds "+defender.name+" and now he has "+defender.life+"% of life.");
				}
				if (defender.life<=0) {
					break;
				}
    		}
	    	
        	counter=1;
		}
    	if (defender.life<=0) {
			break;
		}
    }
    	if (this.life<superhero.life) {
			System.out.println(superhero.getName()+" won!");
		}
    	else {
    		System.out.println(this.getName()+" won!");
    	}
 
    }
}
