package rvt;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Salary " + this.salary + " euros/month";
    }

    public static void main(String[] args) {
        // Teacher ada = new Teacher("Ada Lovelace", "123 Computing St", 4000);
        // Teacher esko = new Teacher("Esko Ukkonen", "456 Algorithm Ave", 5000);
        // System.out.println(ada);
        // System.out.println(esko);

        // Student ollie = new Student("Ollie", "789 Learning Ln");

        // int i = 0;
        // while (i < 25) {
        //     ollie.study();
        //     i++;
        // }
        // System.out.println(ollie);
    }
}
