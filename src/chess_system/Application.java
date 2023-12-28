package chess_system;

import chess_system.chess.ChessMatch;
import chess_system.chess.ChessPiece;
import chess_system.chess.ChessPosition;

import java.util.Scanner;

public class Application {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  ChessMatch chessMatch = new ChessMatch();
  while (true) {
   UI.printBoard(chessMatch.getPieces());
   System.out.println();
   System.out.print("Source: ");
   ChessPosition source = UI.readChessPosition(sc);

   System.out.println();
   System.out.print("Target: ");
   ChessPosition target = UI.readChessPosition(sc);

   ChessPiece capturedPiece = chessMatch.performChessMove(source, target);


  }
 }
}
