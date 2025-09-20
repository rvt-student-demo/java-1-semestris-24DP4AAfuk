package rvt;

import java.util.Scanner;


public class Grades {
  public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.print("Enter the grade:");
    int grade = scanner.nextInt();

    if (grade > 100) {
      System.out.println("Grade: Incredible!");
    } else if (grade <= 100 && grade >= 90) {
      System.out.println("Grade: 5");
    } else if (grade <= 89 && grade >= 80) {
      System.out.println("Grade: 4");
    } else if (grade <= 79 && grade >= 70) {
      System.out.println("Grade: 3");
    } else if (grade <= 69 && grade >= 60) {
      System.out.println("Grade: 2");
    } else if (grade <= 59 && grade >= 50) {
      System.out.println("Grade: 1");
    } else if (grade <= 49 && grade >= 0) {
      System.out.println("Grade: Failed");
    } else {
      System.out.println("Grade: Impossible!");
    }
  }
}
