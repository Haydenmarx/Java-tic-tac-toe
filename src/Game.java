public class Game {
  public String[] getBoard() {
    return board;
  }

  public void setBoard(String piece, int location) {
    board[location] = piece;
  }

  private String[] board = {null, null, null, null, null, null, null, null, null};

  public static void game() {

  }

}
