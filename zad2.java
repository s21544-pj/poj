import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = scan.nextInt();
        int height = scan.nextInt();
        height=height*height;
        int result = weight/height;
        if(result<18.5)System.out.print("niedowada");
        else if(result<25)System.out.print("norma");
        else System.out.print("nadwaga");

    }
    /*
    Summary:Zadanie 2, BMI
    Author:Mariusz Krzyżopolski
     */
}