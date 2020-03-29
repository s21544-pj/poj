/*
Author:Mariusz Krzyżopolski
Summary:Klasa EmployeeJoin zadanie 16
*/
public class EmployeeJoin{
  private String name;
  private int salary;
  private String joinDate;
  EmployeeJoin(String name,int salary,String joinDate){
    this.name = name;
    this.salary = salary;
    this.joinDate = joinDate;
  }
  public String printData(){
    return name+":"+salary+":"+joinDate;
  }
}