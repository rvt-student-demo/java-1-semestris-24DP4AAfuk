package rvt;

public class Chapter60 {
    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        ex4();
        // ex5();
    }

    public static void ex1() {
        int[] val1 = {0, 1 , 2, 3};
        int sum = 0;

        for (int i = 0; i < val1.length; i++) {
            sum += val1[i];
        }
        System.out.println("Sum is: " + sum);
    }
    public static void ex2() {
        int[] val2 = {13, -4, 82, 17};
        int[] twice = new int[val2.length];

        System.out.print("Original array: ");
        for (int i = 0; i < val2.length; i++) {
            System.out.print(val2[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < val2.length; i++) {
            twice[i] = val2[i] * 2;
        }

        System.out.print("\nNew array: ");
        for (int i = 0; i < twice.length; i++) {
            System.out.print(twice[i] + " ");
        }
    }
    public static void ex3() {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};

        for (int i = 0; i < valA.length; i++) {
            sum[i] = valA[i] + valB[i];
        }

        System.out.print("sum: ");
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
    }
    public static void ex4() {
        // code here
    }
    public static void ex5() {
        // code here
    }
}
