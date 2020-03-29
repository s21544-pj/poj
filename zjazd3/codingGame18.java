/*
Author:Mariusz Krzyżopolski
Summary: Zadanie 18
https://www.codingame.com/ide/puzzle/rock-paper-scissors-lizard-spock
An international Rock Paper Scissors Lizard Spock tournament is organized, all players receive a number when they register.

Each player chooses a sign that he will keep throughout the tournament among:
Rock (R)
Paper (P)
sCissors (C)
Lizard (L)
Spock (S)

Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
and in case of a tie, the player with the lowest number wins (it's scandalous but it's the rule).
*/
import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> symbols = new ArrayList<String>(); 
        ArrayList<Integer> players = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            players.add(in.nextInt());
            symbols.add(in.next());
        }
        for(int i=N;i>0;i/=2){
        for(int j=0;j<i/2;j++){
        int lose = wholose(players.get(j),players.get(j+1),symbols.get(j),symbols.get(j+1));
        symbols.remove(players.indexOf(lose));
        players.remove(players.indexOf(lose));
        }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        String result = ""+players;
        result = result.replaceAll("[^0-9]","");
        System.out.println(result);
    }
    public static int wholose(int fn,int sn,String fs,String ss){
    if(fs.equals(ss)){
    return Math.max(fn,sn);
    }
        if(fs.equals("R")){
            if(ss.equals("P")||ss.equals("S"))return fn; 
            else return sn;
        }
        else if(fs.equals("P")){
            if(ss.equals("C")||ss.equals("L"))return fn; 
            else return sn;
        }
        else if(fs.equals("C")){
            if(ss.equals("S")||ss.equals("R"))return fn; 
            else return sn;
        }else if(fs.equals("S")){
            if(ss.equals("P")||ss.equals("L"))return fn; 
            else return sn;
        }else if(fs.equals("L")){
            if(ss.equals("R")||ss.equals("C"))return fn; 
            else return sn;
        }
        return 0;
    }
}