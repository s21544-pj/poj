/*
Author:Mariusz Krzyżopolski
Summary:Test klasy Account zadanie 13
*/
public class TestAccount{
	public static void main (String[]args)
  	{
    Account a = new Account("a","AccountA");
    Account b = new Account("b","AccountB",100);
    System.out.println(a.getID());
    System.out.println(b.getName());
    System.out.println(a.getBalance());
    System.out.println(a.credit(10));
    System.out.println(b.debit(20));
    System.out.println(b.transferTo(a,25));
    System.out.println(a.toString());
    System.out.println(b.toString());
  	}
}