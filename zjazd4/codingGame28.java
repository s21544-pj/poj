/*
Author:Mariusz Krzyżopolski
Summary:zadanie 28
A strip of bushland is on fire. An aerial firefighter is dispatched to the site to put out fire using water drops.

The bushland has an area of 1 x L unit length and each water drop is effective to put out fire in 3 consecutive unit cells.

For example, if a water drop is targeted at cell 4, by splash effect it will put out fire in cell 3, 4 and 5 at the same time.
 _ _ _ _ _ _ _ _
|_|_|f|f|f|_|_|_
 1 2 3 4 5 6 7

If the water drop is targeted at cell 1, fire in cell 1 and 2 will be put out.

Given the location of fire on the strip, you have to command the firefighter to put out all fire with the least number of water drops.

At this moment wind speed is very slow. You can assume the fire does not spread during your operation.

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
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int results[] = new int[N];
        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            int j=0;
            results[i]=0;
            while(j<line.length()){
                int n=1;
                if(line.charAt(j)=='f'){
                    if(line.length()>j+1&&line.charAt(j+1)=='f'){
                        if(line.length()>j+2&&line.charAt(j+2)=='f'){
                            n+=1;
                        }
                        n+=1;
                    }
                    results[i]++;
                    j+=n;
                }
                else if(line.length()>j+1&&j>=1&&line.charAt(j-1)=='f'&&line.charAt(j+1)=='f'){
                    j+=2;
                }
                else{
                    j++;
                }
            }
            System.err.println(line+" "+results[i]);
        }
        for (int i = 0; i < N; i++) {

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(results[i]);
        }
    }
}