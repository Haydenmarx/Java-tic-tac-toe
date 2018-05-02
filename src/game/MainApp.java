package game;

import processing.core.PApplet;

public class MainApp extends PApplet {

  public static void main(String[] args) {
    PApplet.main("game.MainApp", args);
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

    int xloc = mouseX < 33 ? 0 : mouseX < 66 ? 33 : 66;
    int yloc = mouseY < 33 ? 0 : mouseY < 66 ? 33 : 66;
    rect(xloc, yloc, 33, 33);

    if (mousePressed == true) {
      int x = xloc == 33 ? 1 : xloc == 66 ? 2 : xloc;
      int y = yloc == 33 ? 1 : yloc == 66 ? 2 : yloc;
      int square = y * 3 + x;
      System.out.println(square);
      if (newGame.getPiece(square) == null) {
        newGame.setBoard(newGame.getCurrentPiece(), square);
        newGame.setCurrentPiece();
      }
      fill(150); // White
    } else {
      fill(100);
    }
    if (newGame.getPiece(0) == "game.gameObjects.X") {
      line(12, 12, 22, 22);
      line(12, 22, 22, 12);
    } else if (newGame.getPiece(0) == "game.gameObjects.O") {
      fill(204);
      ellipse(17, 17, 15, 15);
      fill(100);
    }


    if (newGame.getPiece(1) == "game.gameObjects.X") {
      line(45, 12, 55, 22);
      line(45, 22, 55, 12);
    } else if(newGame.getPiece(1) == "game.gameObjects.O")  {
      fill(204);
      ellipse(50, 17, 15, 15);
      fill(100);

    }

    if (newGame.getPiece(2) == "game.gameObjects.X") {
      line(78, 12, 88, 22);
      line(78, 22, 88, 12);
    } else if(newGame.getPiece(2) == "game.gameObjects.O") {
      fill(204);
      ellipse(83, 17, 15, 15);
      fill(100);
    }


    if (newGame.getPiece(3) == "game.gameObjects.X") {
      line(12, 45, 22, 55);
      line(12, 55, 22, 45);
    } else if(newGame.getPiece(3) == "game.gameObjects.O") {
      fill(204);
      ellipse(17, 50, 15, 15);
      fill(100);
    }

    if (newGame.getPiece(4) == "game.gameObjects.X") {
      line(45, 45, 55, 55);
      line(45, 55, 55, 45);
    } else if(newGame.getPiece(4) == "game.gameObjects.O") {
      fill(204);
      ellipse(50, 50, 15, 15);
      fill(100);
    }

    if (newGame.getPiece(5) == "game.gameObjects.X") {
      line(78, 45, 88, 55);
      line(78, 55, 88, 45);
    } else if(newGame.getPiece(5) == "game.gameObjects.O") {
      fill(204);
      ellipse(83, 50, 15, 15);
      fill(100);
    }

    if (newGame.getPiece(6) == "game.gameObjects.X") {
      line(12, 78, 22, 88);
      line(12, 88, 22, 78);
    } else if(newGame.getPiece(6) == "game.gameObjects.O") {
      fill(204);
      ellipse(17, 83, 15, 15);
      fill(100);
    }

    if (newGame.getPiece(7) == "game.gameObjects.X") {
      line(45, 78, 55, 88);
      line(45, 88, 55, 78);
    } else if(newGame.getPiece(7) == "game.gameObjects.O") {
      fill(204);
      ellipse(50, 83, 15, 15);
      fill(100);
    }

    if (newGame.getPiece(8) == "game.gameObjects.X") {
      line(78, 78, 88, 88);
      line(78, 88, 88, 78);
    } else if(newGame.getPiece(8) == "game.gameObjects.O") {
      fill(204);
      ellipse(83, 83, 15, 15);
      fill(100);
    }

  }

}
