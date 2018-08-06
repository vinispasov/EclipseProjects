package Chess;
enum Movements{
	UP,DIAGONAL,VERTICAL,EVERYWHERE,KNIGHT_MOVES,EVERYWHERE_WITH_ONE_TURN;
}
enum Category{
	WEAK,MEDIUM,HIGH,KING;
}
public abstract class Pieces {
	private String name;
	private Category category;
	private Movements movement;
	public Pieces(String name, Category category) {
		setName(name);
		setCategory(category);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public Movements getMovement() {
		return movement;
	}

	public void setMovement(Movements movement) {
		this.movement = movement;
	}
	
	public void isValidMovement() {
		
	}

}
