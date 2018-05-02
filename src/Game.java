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

  public static void game() {

  }

}
