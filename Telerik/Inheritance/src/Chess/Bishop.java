package Chess;

public class Bishop extends Pieces {

	public Bishop(String name, Category category) {
		super(name, category);
		super.setMovement(Movements.DIAGONAL);
	}

}
