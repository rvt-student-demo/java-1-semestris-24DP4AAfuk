package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {

    public static void main(String[] args) {
        // onlyTheseNumbers();
        // listSize();
        // onTheList();
        // ArrayList<String> strings = new ArrayList<>();
        
        // strings.add("first");
        // strings.add("second");
        // strings.add("third");

        // removeLast(strings);
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
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter strings (empty string to stop): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        System.out.print("Enter a string to search for: ");
        String searchString = scanner.nextLine();

        if (strings.contains(searchString)) {
            System.out.println("The string is on the list.");
        } else {
            System.out.println("The string is not on the list.");
        }
    }
    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            System.out.println("The list is empty. Nothing to remove.");
        } else {
            String removedString = strings.remove(strings.size() - 1);
            System.out.println(strings);
            System.out.println("Removed string: " + removedString);
        }
    }
}
