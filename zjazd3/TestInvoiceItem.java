/*
Author:Mariusz Krzyżopolski
Summary:Test klasy InvoiceItem zadanie 12
*/
public class TestInvoiceItem{
  public static void main (String[]args)
  {
    InvoiceItem i = new InvoiceItem("1","something",20,30.5);
    System.out.println("ID "+i.getID()+"desc "+i.getDesc()+"qty "+i.getQty()+"unitPrice "+i.getUnitPrice());
    i.setQty(10);
    i.setUnitPrice(5.5);
    System.out.println(i.getTotal());
    System.out.println(i.toString());
  }
}