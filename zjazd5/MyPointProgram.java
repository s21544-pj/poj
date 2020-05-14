/*
Author: Mariusz Krzyżopolski
Summary: klasa inicjalizująca 10 współrzędnych od (1,1) do (10,10)
*/
class MyPointProgram {
  public MyPointProgram(){
    MyPoint[] arr = new MyPoint[10];
    for(int i=1;i<=10;i++){
      arr[i-1]= new MyPoint(i,i);
      System.out.println(arr[i-1].toString());
    }
  }
}