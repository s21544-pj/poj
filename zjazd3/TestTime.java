/*
Author:Mariusz Krzyżopolski
Summary:Test klasy Time zadanie 15
*/
public class TestTime{
	public static void main (String[]args)
  	{
    Time t = new Time(20,0,2);
    System.out.println(t.getHour());
    System.out.println(t.getMinute());
    System.out.println(t.getSecond());
    t.setHour(21);
    t.setMinute(59);
    t.setSecond(4);
    System.out.println(t.toString());
    t.setTime(23,59,59);
    System.out.println(t.nextSecond());
    System.out.println(t.previousSecond());
  	}
}