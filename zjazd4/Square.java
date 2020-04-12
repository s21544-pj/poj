/*
Author:Mariusz Krzyżopolski
Summary:zadanie 23 klasa Square
*/
public class Square extends Rectangle {
  public Square() {}
  public Square(double side) {
    super(side,side);
  }
  public Square(String color, boolean filled, double side) {
    super(color, filled, side, side);
  }
  public double getSide(){
    return this.getLength();
  }
  public void setSide(double side) {
    this.setLength(side);
    this.setWidth(side);
  }
  public void setWidth(double side) {
    this.setWidth(side);
  }
  public void setLength(double side) {
    this.setLength(side);
  }
  public String toString() {
    return "Square["+super.toString()+"]";
    }
}