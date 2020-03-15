/*
Summary:obliczanie pola,obwodu trojkata wraz ze sprawdzeniem rownobocznosci,roznobocznosci i rownoramiennosci
Author: Mariusz Krzyżopolski s21544
*/
public class Main {
    public static void main(String[] args) {
    Triangle tr = new Triangle(3,3,3);
    System.out.println("Triangle is Equilateral:"+tr.isEquilateral()+" Isosceles:"+tr.isIsosceles()+" Scalene:"+tr.isScalene());
    System.out.println("Circuit: "+tr.calcCircuit()+" Pole: "+tr.calcPole());
    }
}
class Triangle {
    private int sideA, sideB, sideC;
    public Triangle(int a,int b,int c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }
    public int calcCircuit(){
        return sideC+sideB+sideA;
    }
    public double calcPole(){
        double p;
        double d = calcCircuit()/2.0;
        p = Math.sqrt(d*(d-sideA)*(d-sideB)*(d-sideC));
        return p;
    }
    public boolean isEquilateral(){
        boolean eq;
        if((sideA==sideB)&&(sideA==sideC)){
            eq = true;
        }else {
            eq = false;
        }
        return eq;
    }
    public boolean isIsosceles(){
        boolean iso;
        if((sideA==sideB)||(sideA==sideC)||(sideB==sideC)){
            iso = true;
        }else{
            iso = false;
        }
        return iso;
    }
    public boolean isScalene(){
        boolean sca;
        if (isIsosceles()){
            sca = false;
        }else{
            sca = true;
        }
        return sca;
    }
}