package application;

import chess.ChessMatch;
import chessconsole.UI;

public class Program {

	public static void main(String[] args) {

		ChessMatch cheassMatch = new ChessMatch();
		UI.printBoard(cheassMatch.getPieces());

	}

}
