/*
Author:Mariusz Krzyżopolski
Summary: klasa zamówienia
*/
public class Invoice {
    private Customer customer;
    private double amount;
    private int ID;

    public Invoice(int ID, Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        double discount = amount*customer.getDiscount()/100;
        return amount-discount;
    }
}