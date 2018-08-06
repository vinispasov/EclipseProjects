package Chess;

public class King extends Pieces {

	public King(String name, Category category) {
		super(name, category);
		super.setMovement(Movements.EVERYWHERE_WITH_ONE_TURN);
	}

}
