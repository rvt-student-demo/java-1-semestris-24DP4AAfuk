package rvt;

import java.util.Scanner;

public class Parts {
    public static void main(String[] args) {
        // input and variable declaration area
        Scanner scanner = new Scanner(System.in);

        final int BOLT_PRICE = 5;
        final int NUT_PRICE = 3;
        final int WASHER_PRICE = 1;
        
        System.out.print("Enter number of bolts: ");
        int bolts = scanner.nextInt();

        System.out.print("Enter number of nuts: ");
        int nuts = scanner.nextInt();

        System.out.print("Enter number of washers: ");
        int washers = scanner.nextInt();

        // processing area
        int totalPrice = (bolts * BOLT_PRICE) + (nuts * NUT_PRICE) + (washers * WASHER_PRICE);
        boolean enoughNuts = nuts >= bolts;
        boolean enoughWashers = washers >= (2 * bolts);

        // output area
        if (!enoughNuts) {
            System.out.println("Check the order: too few nuts");
            return;
        }
        if (!enoughWashers) {
            System.out.println("Check the order: too few washers");
            return;
        }
    System.out.println("Order is OK\n");
    System.out.println("==============================");
    System.out.println("      Bob's Discount Bolts     ");
    System.out.println("==============================");
    System.out.printf("%-10s %5s x %2s = %5s cents\n", "Bolts", bolts, BOLT_PRICE, (bolts * BOLT_PRICE));
    System.out.printf("%-10s %5s x %2s = %5s cents\n", "Nuts", nuts, NUT_PRICE, (nuts * NUT_PRICE));
    System.out.printf("%-10s %5s x %2s = %5s cents\n", "Washers", washers, WASHER_PRICE, (washers * WASHER_PRICE));
    System.out.println("------------------------------");
    System.out.printf("%-20s %7s cents\n", "TOTAL:", totalPrice);
    System.out.println("==============================");
    }
}
