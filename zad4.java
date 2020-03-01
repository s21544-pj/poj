import java.util.Scanner;
    /*
    Summary:Zadanie 4, piramidka
    Author:Mariusz Krzyżopolski
     */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char l;
        for(int i=0;i<n;i++){
            for(int p=0;p<n-1-i;p++){System.out.print(" ");}
            for(int j=0;j<=i*2;j++){
                if(j>i){
                    l=(char)(97+i*2-j);
                }else{
                    l=(char)(97+j);
                }
                System.out.print(l);
            }
            System.out.print("\n");
        }

    }

}