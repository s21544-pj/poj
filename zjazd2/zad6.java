/*
Summary: prosty ladownik marsjanski(sterowanie napedem zaleznie od predkosci)
Author: Mariusz Krzyżopolski s21544

https://www.codingame.com/training/easy/mars-lander-episode-1

This puzzle teaches you how to compare values using a simple condition.

External resources Conditions
STATEMENT
The goal of this puzzle is to safely land the spaceship on the platform. It's an simple introduction to the « Mars Lander - Episode 2 ». Some data is useless and solving this problem only requires a simple condition.

*/
import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
        }

        // game loop
        while (true) {
            int p=0;
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).
            p = (vSpeed<-20) ? 4 : 0;
            System.out.println("0 "+p);
        }
    }
}