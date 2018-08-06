package Chess;

public class Pawn extends Pieces {

	public Pawn(String name, Category category) {
		super(name, category);
		super.setMovement(Movements.UP);
	}
	

}
