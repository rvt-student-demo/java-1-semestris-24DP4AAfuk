package rvt;

public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return this.name + "\n  " + this.address;
    }
    // public static void main(String[] args) {
    //     Person person = new Person("Alice", "456 Oak St");
    //     System.out.println(person);

    //     Person person2 = new Person("Bob", "123 Main St");
    //     System.out.println(person2);
    // }
}