package boardgame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece() {
	}

	public Piece(Board board) {
		setBoard(board);
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	private void setBoard(Board board) {
		this.board = board;
	}

}
