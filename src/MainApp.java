import processing.core.PApplet;

public class MainApp extends PApplet {

  public static void main(String[] args) {
    PApplet.main("MainApp", args);
    Game newGame = new Game();
    newGame.setBoard("X", 0);
    System.out.println(newGame.getBoard());
    System.out.println("--------------");
    newGame.setBoard("X", 1);
    System.out.println(newGame.getBoard());
    System.out.println("--------------");

  }

  public void setup() {
    size(100, 100);
//    noStroke();
    fill(100);
  }

  public void draw() {
    background(204);
    line(33, 0, 33, 100);
    line(66, 0, 66, 100);
    line(0, 33, 100, 33);
    line(0, 66, 100, 66);


    if (mousePressed == true) {
      fill(150); // White
    } else {
      fill(100);
    }

    int xloc = mouseX < 33 ? 0 : mouseX < 66 ? 33 : 66;
    int yloc = mouseY < 33 ? 0 : mouseY < 66 ? 33 : 66;
    rect(xloc, yloc, 33, 33);


    if ('x' == 'x') {
      X first = new X();
      line(first.getTopX(), first.getTopY(), first.getBottomX(), first.getBottomY());
      line(first.getTopX(), first.getBottomY(), first.getBottomX(), first.getTopY());
      line(12, 12, 22, 22);
      line(12, 22, 22, 12);
    } else if ('o' == 'o') {
      //
    } else {
      //nothing
    }


    //x + 33
    line(45, 12, 55, 22);
    line(45, 22, 55, 12);

    //x + 66
    line(78, 12, 88, 22);
    line(78, 22, 88, 12);




    line(12, 45, 22, 55);
    line(12, 55, 22, 45);

    line(45, 45, 55, 55);
    line(45, 55, 55, 45);

    line(78, 45, 88, 55);
    line(78, 55, 88, 45);



    line(12, 78, 22, 88);
    line(12, 88, 22, 78);

    line(45, 78, 55, 88);
    line(45, 88, 55, 78);

    line(78, 78, 88, 88);
    line(78, 88, 88, 78);


  }

}
