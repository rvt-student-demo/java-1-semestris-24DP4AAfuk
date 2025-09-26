package rvt;

import java.util.Scanner;

public class Delicacy {
    public static void main(String[] args) {
        // input area
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sam and Ella's Delicacy Shop!");

        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the product price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Include express delivery (y/n): ");
        char answer = scanner.next().charAt(0);

        double deliveryFee = 0;
        if (productPrice < 10) {
            deliveryFee = 2.0;
        } else {
            deliveryFee = 0;
        }

        if (answer == 'y' || answer == 'Y') {
            deliveryFee += 3.0;
        }

        double totalPrice = productPrice + deliveryFee;

        // cheque output area
        System.out.println("\n\n------- Sam and Ella's Delicacy Shop -------");
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + productPrice);
        System.out.println("Delivery fee: $" + deliveryFee);
        System.out.println("--------------------------------------------");
        System.out.println("Total price: $" + totalPrice);
        System.out.println("--------------------------------------------");
        System.out.println("Thank you for shopping with us!");
    }   
}
