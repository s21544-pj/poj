/*
Author: Mariusz Krzyżopolski
Summary: zadanie 1,klasa punktu
*/
class MyPoint {
 private int x;
 private int y;

 public MyPoint(){
   this.x = 0;
   this.y = 0;
 }

 public MyPoint(int x,int y){
   this.x = x;
   this.y = y;
 }

 public int getX(){
   return x;
 }

 public void setX(int x){
   this.x = x;
 }

 public int getY(){
   return y;
 }

 public void setY(int y){
  this.y = y;
 }

 public int[] getXY(){
   int[] result={x,y};
   return result;
 }

 public void setXY(int x, int y){
   this.x = x;
   this.y = y;
 }

 public String toString(){
   return "("+x+","+y+")";
 }

 public double distance(int x, int y){
   return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
 }

 public double distance(MyPoint another){
   return Math.sqrt(Math.pow((this.x-another.getX()),2)+Math.pow((this.y-another.getY()),2));
 }

 public double distance(){
   return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
 }
}