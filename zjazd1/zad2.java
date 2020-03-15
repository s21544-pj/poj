import java.util.Scanner;
    /*
    Summary:Zadanie 2, BMI waga w kg,wzorst w m
    Author:Mariusz Krzyżopolski
     */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        height=height*height;
        double result = weight/height;
        System.out.print(result);
        if(result<18.5)System.out.print("niedowada");
        else if(result<25)System.out.print("norma");
        else System.out.print("nadwaga");

    }

}