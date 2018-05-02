package game;

public class Game {
  public String[] getBoard() {
    return board;
  }

  public void setBoard(String piece, int location) {
    board[location] = piece;
  }

  public String getPiece(int location) {
    return board[location];
  }

  private String[] board = {null, null, null, null, null, null, null, null, null};

  public String getCurrentPiece() {
    return currentPiece;
  }

  public void setCurrentPiece() {
    currentPiece = currentPiece == "game.gameObjects.X" ? "game.gameObjects.O" : "game.gameObjects.X";
  }

  private String currentPiece = "game.gameObjects.X";

  public static void game() {

  }

}
