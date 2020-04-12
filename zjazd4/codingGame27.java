/*
Author:Mariusz Krzyżopolski
Summary:Zadanie 27
Write a program that prints the temperature closest to 0 among input data. 
If two numbers are equally close to zero, positive integer has to be considered closest to zero
 (for instance, if the temperatures are -5 and 5, then display 5).
*/
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int result = 5527; //powyzej maksymalnej temperatury programu
        int n = in.nextInt(); // the number of temperatures to analyse
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            int s=t;
            if(t<0) s=t*-1;
            if(s<Math.abs(result)){
                if(s==result){if(t>0)result=t;}
                else{result = t;}
            }
        }
        if(result==5527) result=0;
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}