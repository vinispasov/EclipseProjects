
public class SuperHero extends Hero{

	public SuperHero(String name, int weight, boolean isMale, String secretIdentity, String backStory, boolean isGood) {
		super(name, weight, isMale, secretIdentity, backStory, isGood);
	}
	
	public void saveWorld(Hero hero) {
		System.out.println(this.getName()+" beat "+hero.getName()+" and saved the world!");
	}

	@Override
	public void addSuperPower(Powers power) {
		this.getListOfPowers().add(power);
		System.out.println("Added power to the superhero "+this.getName());
	}
}
