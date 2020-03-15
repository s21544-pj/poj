/*
Summary:Wykrywanie najwyższej góry
Author: Mariusz Krzyżopolski s21544

https://www.codingame.com/training/easy/the-descent

WHAT WILL I LEARN?
Loops
Solving this puzzle makes you understand the concept of loops and the ways of retrieving the maximum value from a list of integers.

This puzzle can also be a playground to experiment the concept of lambdas in different programming languages. It's also an opportunity to discover functional programming.

External resources SortingLoopsThe Descent - Let's Play
STATEMENT
A simple problem to try out the CodinGame platform: your program must find the highest mountain out of a list of mountains.
*/

import java.util.*;
import java.io.*;
import java.math.*;


class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // game loop
        while (true) {
            int target = 0;
            int targetH = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if(mountainH>targetH){
                    target=i;
                    targetH=mountainH;
                    }
            }
            

            System.out.println(target); // The index of the mountain to fire on.
        }
    }
}