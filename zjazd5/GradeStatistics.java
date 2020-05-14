/*
Author: Mariusz Krzyżopolski
Summary: zadanie 7 Klasa Statystyczna dla ocen uczniów. Program urumiany za pomocą nowej instancji klasy = new GradeStatistics();
*/
import java.util.*;

class GradeStatistics{
  private int numOfStudents;
  private int[] gradesOfStudents;

  public GradeStatistic(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of students: ");
    this.numOfStudents = scan.nextInt();
    this.gradesOfStudents = new int[numOfStudents];
    for(int i=0;i<numOfStudents;i++){
      System.out.println("Enter grad of student"+i+" :");
      gradesOfStudents[i] = scan.nextInt();
    }
    calc();
  }
  private void calc(){
    Arrays.sort(gradesOfStudents);
    printGrades();
    System.out.printf("\n average is %.2f \n", getAverage());
    System.out.println("median is "+getMedian());
    System.out.println("minimum is "+getMin());
    System.out.println("maximum is "+getMax());
    System.out.printf("standard deviadiot is %.2f \n", getDeviation());
  }
  private void printGrades(){
    System.out.print("[");
    for(int i=0;i<numOfStudents;i++){
      System.out.print(gradesOfStudents[i]+", ");
    }
    System.out.print("]");
  }

  private float getAverage(){
    return (getSum()/numOfStudents);
  }

  private int getMedian(){
    return gradesOfStudents[(int)Math.floor((numOfStudents-1)/2)];
  }

  private int getMin(){
    return gradesOfStudents[0];
  }

  private int getMax(){
    return gradesOfStudents[numOfStudents-1];
  }

  private float getDeviation() {
    float deviation=0;
    for(int i=0;i<numOfStudents;i++){
      deviation+=Math.pow((gradesOfStudents[i]-getAverage()),2);
    }
    return (float)Math.sqrt((deviation/numOfStudents));
  }

  private int getSum(){
    int sum=0;
    for(int i=0;i<numOfStudents;i++){
      sum+=gradesOfStudents[i];
    }
    return sum;
  }
  
}