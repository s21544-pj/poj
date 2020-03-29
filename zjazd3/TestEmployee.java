/*
Author:Mariusz Krzyżopolski
Summary:Test klasy Employee z zadania 11
*/
public class TestEmployee
{
  public static void main (String[]args)
  {
    Employee e = new Employee (0, "Mariusz", "Krzyzopolski", 3000);
    System.out.println ("Employee id=" + e.getID () + " firstName " +
      e.getFirstName () + " lastName " + e.getLastName ());
    System.out.println ("name " + e.getName () + " salary " + e.getSalary ());
    e.setSalary (2000);
    //raise by 10%
    System.out.println (e.getAnnualSalary ());
    System.out.println (e.raiseSalary (10));
    System.out.println (e.toString ());
  }
}
