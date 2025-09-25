package rvt;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the value of the gift: ");
        int gift = scanner.nextInt();
        calculateTax(gift);
    }

    public static double calculateTax(int gift) {
        double tax;

        if (gift < 5000) {
            tax = 0.0;
        } else if (gift >= 5000 && gift < 25000) {
            tax = 100 + (gift - 5000) * 0.08;
        } else if (gift >= 25000 && gift < 55000) {
            tax = 1700 + (gift - 25000) * 0.10;
        } else if (gift >= 55000 && gift < 200000) {
            tax = 4700 + (gift - 55000) * 0.12;
        } else if (gift >= 200000 && gift < 1000000) {
            tax = 22100 + (gift - 200000) * 0.15;
        } else if (gift >= 1000000) {
            tax = 142100 + (gift - 1000000) * 0.17;
        } else {
            tax = 0.0;
        }

        System.out.println("Tax: " + tax);
        return tax;
    }
}
