package rvt;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ievadi pozitīvu skaitli (0 un negatīvi skaitļi pārtrauc ievadi): ");
            num = scanner.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
            count++;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("\n\nKopējā summa: " + sum);
            System.out.println("Ievadīto skaitļu skaits: " + count);
            System.out.println("Vidējā vērtība: " + average);
            System.out.println("Lielākais skaitlis: " + max);
            System.out.println("Mazākais skaitlis: " + min);
        } else {
            System.out.println("Nav ievadīti pozitīvi skaitļi.");
        }
    }
}
