import processing.core.PApplet;

public class MainApp extends PApplet {

  public static void main(String[] args) {
    PApplet.main("MainApp", args);
  }

  public void setup() {
    size(100, 100);
//    noStroke();
    fill(100);
  }
  Game newGame = new Game();

  public void draw() {
    background(204);
    line(33, 0, 33, 100);
    line(66, 0, 66, 100);
    line(0, 33, 100, 33);
    line(0, 66, 100, 66);


    if (mousePressed == true) {
      newGame.setBoard("X", 0);
      fill(150); // White
    } else {
      fill(100);
    }

    int xloc = mouseX < 33 ? 0 : mouseX < 66 ? 33 : 66;
    int yloc = mouseY < 33 ? 0 : mouseY < 66 ? 33 : 66;
    rect(xloc, yloc, 33, 33);


    if (newGame.getPiece(0) == "X") {
      line(12, 12, 22, 22);
      line(12, 22, 22, 12);
    } else if (newGame.getPiece(0) == "O") {
      //
    }


    if (newGame.getPiece(1) == "X") {
      line(45, 12, 55, 22);
      line(45, 22, 55, 12);
    }

    if (newGame.getPiece(2) == "X") {
      line(78, 12, 88, 22);
      line(78, 22, 88, 12);
    }


    if (newGame.getPiece(3) == "X") {
      line(12, 45, 22, 55);
      line(12, 55, 22, 45);
    }

    if (newGame.getPiece(4) == "X") {
      line(45, 45, 55, 55);
      line(45, 55, 55, 45);
    }

    if (newGame.getPiece(5) == "X") {
      line(78, 45, 88, 55);
      line(78, 55, 88, 45);
    }

    if (newGame.getPiece(2) == "X") {
      line(12, 78, 22, 88);
      line(12, 88, 22, 78);
    }

    if (newGame.getPiece(2) == "X") {
      line(45, 78, 55, 88);
      line(45, 88, 55, 78);
    }

    if (newGame.getPiece(2) == "X") {
      line(78, 78, 88, 88);
      line(78, 88, 88, 78);
    }

  }

}
