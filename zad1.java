import java.util.Scanner;
    /*
    Summary:Flaga Polski i Japonii w znakach ASCII
    Size: 1 - small 2 - medium 3 - big
    Author:Mariusz Krzyżopolski
     */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt()*9;
        for(int i=0;i<size/3;i++) {
            Pflag(" ",size);
        }
        for(int i=0;i<size/3;i++) {
            Pflag("0",size);
        }
        Jflag("0",size);
        
    }
    public static void Jflag(String x,int y){
        for (int j=0; j<y; j++)
        {
        for(int i=1; i<2*y; i++)
        {
            if((j<y*3/4&&j>y*1/4)&&(i<y*3/2&&i>y*1/2))
                System.out.print(x);
            else
                System.out.print(".");
        }
        System.out.print("\n");
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

}