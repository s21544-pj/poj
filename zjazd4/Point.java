/*
Author:Mariusz Krzyżopolski
Summary: zadanie 22, główna klasa Point
*/
class Point{
  private float x;
  private float y;
  public Point(float x,float y){
    this.x = x;
    this.y = y;
  }
  public Point(){
    x = 0.0f;
    y = 0.0f;
  }
  public float getX(){
    return x;
  }
    public float getY(){
    return y;
  }
  public void setX(float x){
    this.x = x;
  }
    public void setY(float y){
    this.y = y;
  }
  public float[] getXY(){
    float[] arr={x,y};
    return arr;
  }
  public void setXY(float x, float y){
    this.x = x;
    this.y = y;
  }
  public String toString(){
    return "("+x+","+y+")";
  }
}