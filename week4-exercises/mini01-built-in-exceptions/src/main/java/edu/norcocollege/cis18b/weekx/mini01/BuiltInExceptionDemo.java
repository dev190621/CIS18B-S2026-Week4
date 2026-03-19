package edu.norcocollege.cis18b.weekx.mini01;

public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: cannot divide by zero.");
        }

        int[] alertLevels = {1, 2, 3};

        try {
            System.out.println("Alert level: " + alertLevels[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: invalid array index.");
        }

        System.out.println("Program completed.");
    }
}
