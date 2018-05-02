public class X {
  private int topX = 12;
  private int bottomX = 22;
  private int topY = 12;
  private int bottomY = 22;

  public void x(int xOffset, int yOffset) {
    this.topX += xOffset;
    this.bottomX += xOffset;
    this.topY += yOffset;
    this.bottomY += yOffset;
  }

  public int getTopX() {
    return topX;
  }

  public void setTopX(int topX) {
    this.topX = topX;
  }

  public int getBottomX() {
    return bottomX;
  }

  public void setBottomX(int bottomX) {
    this.bottomX = bottomX;
  }

  public int getTopY() {
    return topY;
  }

  public void setTopY(int topY) {
    this.topY = topY;
  }

  public int getBottomY() {
    return bottomY;
  }

  public void setBottomY(int bottomY) {
    this.bottomY = bottomY;
  }
}
