/*
Summary:prostokat z obliczaniem pola,obwodu i przekatnej
Author: Mariusz Krzyżopolski s21544
*/
public class Main {
    public static void main(String[] args) {
    Rectangle rec = new Rectangle(20,10);
   System.out.println("Rectangle circuit "+rec.calcCircuit()+" pole "+rec.calcPole()+" diagonal "+rec.calcDiagonal());
    }
}
class Rectangle {
    private int length,height;
    Rectangle(int length,int height){
        this.length = length;
        this.height = height;
    }
    public int calcCircuit(){
        int circuit = 2*height + 2*height;
        return  circuit;
    }
    public int calcPole(){
        int pole = length*height;
        return pole;
    }
    public double calcDiagonal(){
        double diagonal = Math.sqrt(length*length+height*height);
        return diagonal;
    }
}
