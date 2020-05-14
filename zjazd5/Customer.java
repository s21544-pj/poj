/*
Author:Mariusz Krzyżopolski
Summary: klasa klienta
*/
public class Customer {
    private String name;
    private int discount;
    private int ID;
    
    public Customer(int ID, String name, int discount) {
        this.name = name;
        this.discount = discount;
        this.ID = ID;
       
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name +"("+ID+")";
    }
}