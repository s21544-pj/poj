import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        double age = scan.nextDouble();
        String sex = scan.next().charAt(0); 
        double result;
        if(sex=="m"){
        result = 66.47 + 13.7*weight + 5*height - 6.76*age;
        }else{
        result = 655.1 + 9.567*weight + 1.85*height - 4.68*age;
        }
        System.out.print(result);

    }
    /*
    Summary:Zadanie 3, dzienne zapotrzebowanie w kalorie,kg,cm,lata,plec
    Author:Mariusz Krzyżopolski
     */
}