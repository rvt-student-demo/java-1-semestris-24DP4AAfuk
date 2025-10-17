package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {

    public static void main(String[] args) {
        // onlyTheseNumbers();
        // listSize();
        // onTheList();
        // removeLast(ArrayList<String> strings);
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.print("Enter a number (-1 to stop): ");

            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }

        System.out.print("\nEnter start index: ");
            int startRange = scanner.nextInt();

            System.out.print("Enter end index: ");
            int endRange = scanner.nextInt();

            for (int i = startRange; i < endRange + 1; i++) {
                System.out.println(numbers.get(i));
            }
    }
    public static void listSize() {
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter strings (empty string to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        System.out.println("Number of strings entered: " + strings.size());
    }
    public static void onTheList() {
        // TODO complete method
    }
}
