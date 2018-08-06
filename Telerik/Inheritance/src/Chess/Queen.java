package Chess;

public class Queen extends Pieces {

	public Queen(String name, Category category) {
		super(name, category);
		super.setMovement(Movements.EVERYWHERE);
	}

}
