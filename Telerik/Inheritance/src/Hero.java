import java.util.HashSet;
enum Powers{
	TECH,MAGIC,STRONG,RUNNER,INVISIBLE;
}
public class Hero extends Person {

	
	private String secretIdentity;
	private String backStory;
	private boolean isGood;
	private HashSet<Powers>listOfPowers;
	
	

	public Hero(String name, int weight, boolean isMale, String secretIdentity, String backStory, boolean isGood) {
		super(name, weight, isMale);
		setSecretIdentity(secretIdentity);
		setBackStory(backStory);
		setGood(isGood);
	    this.listOfPowers=new HashSet<Powers>();
	}

	public String getSecretIdentity() {
		return secretIdentity;
	}

	public void setSecretIdentity(String secretIdentity) {
		this.secretIdentity = secretIdentity;
	}

	public String getBackStory() {
		return backStory;
	}

	public void setBackStory(String backStory) {
		this.backStory = backStory;
	}

	public boolean isGood() {
		return isGood;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}

	public HashSet<Powers> getListOfPowers() {
		return listOfPowers;
	}

	public void setListOfPowers(HashSet<Powers> listOfPowers) {
		this.listOfPowers = listOfPowers;
	}

	public void addSuperPower(Powers power) {
		this.listOfPowers.add(power);
	}
}
