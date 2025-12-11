package rvt;

import java.util.Scanner;

public class DivisionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the numerator (or 'q' to quit): ");
            String input = scanner.nextLine();
            if (!input.isEmpty() && (input.charAt(0) == 'q' || input.charAt(0) == 'Q')) {
                System.out.println("Exiting the program.");
                break;
            }

            int numerator;
            try {
                numerator = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer for the numerator.");
                continue;
            }

            int divisor;
            while (true) {
                System.out.print("Enter the divisor: ");
                String divisorInput = scanner.nextLine();
                try {
                    divisor = Integer.parseInt(divisorInput);
                    if (divisor == 0) {
                        System.out.println("Divisor cannot be zero. Please enter a non-zero integer.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer for the divisor.");
                }
            }

            double result = (double) numerator / divisor;
            System.out.printf("Result: %d / %d = %s%n", numerator, divisor, result);
        }

        scanner.close();
    }
}
