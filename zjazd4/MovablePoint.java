/*
Author: Mariusz Krzyżopolski
Summary: zadanie 22, subklasa klasy Point
*/
class MovablePoint extends Point{
  private float xSpeed;
  private float ySpeed;
  public MovablePoint(){
    super();
    this.xSpeed = 0.0f;
    this.ySpeed = 0.0f;
  }
  public MovablePoint(float xSpeed, float ySpeed){
    super();
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  public MovablePoint(float xSpeed, float ySpeed,float x,float y){
    super(x,y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  public float getXSpeed() {
    return xSpeed;
  }
  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }
  public float getYSpeed() {
    return ySpeed;
  }
  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }
  public void setSpeed(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  public float[] getSpeed() {
    float[] speed = {xSpeed, ySpeed};
    return speed;
    }
  public String toString(){
    return super.toString()+"speed=("+xSpeed+","+ySpeed+")";
  }
  public MovablePoint Move(){
    this.setX(this.getX()+xSpeed);
    this.setY(this.getY()+ySpeed);
    return this;
  }
}