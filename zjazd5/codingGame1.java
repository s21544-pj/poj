/*
Author:Mariusz Krzyżopolski
Summary: pierwsze zadanie coding game - poprowadzenie przez tunele postaci na podstawie kształtu pokoi i dozwolonych ruchów
https://www.codingame.com/ide/puzzle/the-last-crusade-episode-1
*/
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // number of columns.
        int H = in.nextInt(); // number of rows.
        int[][] Map = new int[W][H]; 
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < H; i++) {
            String LINE = in.nextLine(); // represents a line in the grid and contains W integers. Each integer represents one room of a given type.
            String[] l = LINE.split(" ");
            System.err.println(LINE);
            for(int j = 0; j < l.length; j++) {
                Map[j][i] = Integer.parseInt(l[j]);
            }
        }
        int EX = in.nextInt(); // the coordinate along the X axis of the exit (not useful for this first mission, but must be read).

        // game loop
        while (true) {
            int XI = in.nextInt();
            int YI = in.nextInt();
            String POS = in.next();
            switch(Map[XI][YI]){
                case 6:
                case 2:
                if(POS.equals("LEFT"))XI++;
                else XI--;
                break;
                case 12:
                case 13:
                case 7:
                case 8:
                case 9:
                case 1:
                case 3:
                YI++;
                break;
                case 4:
                if(POS.equals("TOP"))XI--;
                else YI++;
                break;
                case 10:
                XI--;
                break;
                case 5:
                if(POS.equals("TOP"))XI++;
                else YI++;
                break;
                case 11:
                XI++;
                break;
            }
            System.out.println(XI+" "+YI);
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // One line containing the X Y coordinates of the room in which you believe Indy will be on the next turn.
        }
    }
}