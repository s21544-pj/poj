/*
Author:Mariusz Krzyżopolski
Summary:Metoda sprawdzajaca czy zdanie jest palindromem zadanie 17
*/
import java.util.*;

class TestIsPalindrome {
  public static void main (String[]args)
  {
    System.out.println(isPalindrome("kajak"));
    System.out.println(isPalindrome("nie kajak"));
    System.out.println(isPalindrome("Muzo, raz daj jad za rozum."));
    System.out.println(isPalindrome("Wódy żal dla żydów"));
    System.out.println(isPalindrome("Atak kata"));
    System.out.println(isPalindrome("to Napewno nie jest palindrom"));

  }
  public static boolean isPalindrome(String word){
    word = word.replaceAll("[^a-zA-Z]", "");
    word = word.toLowerCase();
    int max=word.length()-1;
    for(int min=0;min<=(word.length()/2)+1;min+=1){
      if(word.charAt(min)!=word.charAt(max)){
        return false;
      }
      max+=-1;
    }
    return true;
  }
}