/*
Author:Mariusz Krzyżopolski
Summary: Klasa Date zadanie 14
*/
public class Date{
  private int day;
  private int month;
  private int year;
  Date(int day,int month,int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public int getDay(){
    return day;
  }
  public int getMonth(){
    return month;
  }
  public int getYear(){
    return year;
  }
  public void setDay(int day){
    this.day = day;
  }
  public void setMonth(int month){
    this.month = month;
  }
  public void setYear(int year){
    this.year = year;
  }
  public void setDate(int day,int month,int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public String toString(){
    String r="";
    if(day<10)r+=("0"+day+"/");else r+=(day+"/");
    if(month<10)r+=("0"+month+"/");else r+=(month+"/");
    return r+=year;
  }
}