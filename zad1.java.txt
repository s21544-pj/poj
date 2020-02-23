import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for(int i=0;i<size/3;i++) {
            Pflag(" ",size);
        }
        for(int i=0;i<size/3;i++) {
            Pflag("0",size);
        }
        
    }
    public static void Pflag(String x,int y){
        System.out.print("|");
        for(int i=0;i<y;i++){
            System.out.print(x);
        }
        System.out.print("|");
        System.out.println();
    }
    /*
    Summary
    Author:Mariusz Krzyżopolski
     */
}
