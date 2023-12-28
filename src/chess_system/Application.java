package chess_system;

import chess_system.boardGame.Board;
import chess_system.chess.ChessMatch;
import chess_system.UI;

public class Application {
 public static void main(String[] args) {

  ChessMatch chessMatch = new ChessMatch();
  UI.printBoard(chessMatch.getPieces());
 }
}
