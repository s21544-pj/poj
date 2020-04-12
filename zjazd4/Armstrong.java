/*
Author:Mariusz Krzyżopolski
Summary: zadanie 24
*/
class Armstrong{
  public boolean isArmstrong(int number){
    int sum = 0;
    String sample = Integer.toString(number);
    for(int i=0;i<sample.length();i++){
      int z = Character.getNumericValue(sample.charAt(i));
      sum+=z*z*z;
    }
    return sum == number;
  }
}