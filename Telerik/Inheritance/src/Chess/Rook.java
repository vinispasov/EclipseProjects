package Chess;

public class Rook extends Pieces{

	public Rook(String name, Category category) {
		super(name, category);
		super.setMovement(Movements.VERTICAL);
	}

}
