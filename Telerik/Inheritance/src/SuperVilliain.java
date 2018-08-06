
public class SuperVilliain extends Hero{

	public SuperVilliain(String name, int weight, boolean isMale, String secretIdentity, String backStory,
			boolean isGood) {
		super(name, weight, isMale, secretIdentity, backStory, isGood);
	}
	
	public void destroy(Hero hero) {
		System.out.println(this.getName()+" beat "+hero.getName()+" and has destroyed everything!");
	}

	@Override
	public void addSuperPower(Powers power) {
		this.getListOfPowers().add(power);
		System.out.println("Added power to the supervillian "+this.getName());
	}
}
