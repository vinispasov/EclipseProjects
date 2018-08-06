package Chess;

public class Knight extends Pieces {

	public Knight(String name, Category category) {
		super(name, category);
		super.setMovement(Movements.KNIGHT_MOVES);
	}

}
