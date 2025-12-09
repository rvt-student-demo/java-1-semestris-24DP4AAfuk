package rvt;

import java.util.ArrayList;

public class Main {

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Student("Alice", "123 Main St"));
        persons.add(new Teacher("Bob", "456 Oak Ave", 7000));

        printPersons(persons);
    }
}
