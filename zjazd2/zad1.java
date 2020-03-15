/*
Summary:Klasa Human z getterami, settery z pomoca constructora. Obiekt z moimi danymi
Author:Mariusz Krzyżopolski s21544
*/
public class Main {
    public static void main(String[] args) {
   Human i = new Human(21,70,195,21544,42,"Mariusz",true);
   System.out.println("Hello "+i.getName());
    }
}
class Human {
    private int age,weight,height,indexNumber,feetSize;
    private String name;
    private boolean male;
    public Human(int age, int weight, int height, int indexNumber, int feetSize, String name, boolean male) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.indexNumber = indexNumber;
        this.feetSize = feetSize;
        this.name = name;
        this.male = male;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public int getHeight() {
        return height;
    }
    public int getIndexNumber() {
        return indexNumber;
    }
    public int getFeetSize() {
        return feetSize;
    }
    public String getName() {
        return name;
    }
    public boolean isMale() {
        return male;
    }
}