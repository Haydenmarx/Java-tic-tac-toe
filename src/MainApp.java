import processing.core.PApplet;

public class MainApp extends PApplet {

  public static void main(String[] args) {
    PApplet.main("MainApp", args);
  }

  Thing myThing;
//  public void settings() {
//    size(800, 600);
//  }

//  public void setup() {
//    background(255);
//    myThing = new Thing(this);
//  }
//
//  public void draw() {
//    stroke(0);
//    fill(255, 0, 255);
//    ellipse(width/2, height/2, 100, 100);
//    myThing.doSomething();
//    frameRate(12);
//    println(mouseX + " : " + mouseY);
//  }

//  public void setup() {
//    size(100, 100);
//    noStroke();
//  }
//
//  public void draw() {
//    float x = mouseX;
//    float y = mouseY;
//    float ix = width - mouseX; // Inverse X
//    float iy = height - mouseY; // Inverse Y
//    background(126);
//    fill(255, 150);
//    ellipse(x, height/2, y, y);
//    fill(0, 159);
//    ellipse(ix, height/2, iy, iy);
//  }

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
    line(43, 10, 53, 20);
    line(43, 20, 53, 10);

    //x + 66
    line(76, 10, 86, 20);
    line(76, 20, 86, 10);


    line(10, 43, 20, 53);
    line(10, 53, 20, 43);

    line(43, 43, 53, 53);
    line(43, 53, 53, 43);

    line(76, 43, 86, 53);
    line(76, 53, 86, 43);



    line(10, 76, 20, 86);
    line(10, 86, 20, 76);

    line(43, 76, 53, 86);
    line(43, 86, 53, 76);

    line(76, 76, 86, 86);
    line(76, 86, 86, 76);


  }

}
