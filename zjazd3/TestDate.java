/*
Author:Mariusz Krzyżopolski
Summary:Test klasy Date zadanie 14
*/
public class TestDate{
	public static void main (String[]args)
  	{
    Date d = new Date(1,1,2015);
    System.out.println(d.getDay());
    System.out.println(d.getMonth());
    System.out.println(d.getYear());
    System.out.println(d.toString());
    d.setYear(2020);
    d.setMonth(4);
    d.setDay(26);
    System.out.println(d.toString());
    d.setDate(29,5,1998);
    System.out.println(d.toString());
  	}
}