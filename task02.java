class Calculator {

    public void add(int a, int b) {
        System.out.println("Addition in int: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Addition in double: " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction in int: " + (a - b));
    }

    public void subtraction(double a, double b) {
        System.out.println("Subtraction in double: " + (a - b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication in int: " + (a * b));
    }

    public void multipication(double a, double b) {
        System.out.println("Multiplication in double: " + (a * b));
    }

    public void divide(int a, int b) {

            System.out.println("Division in int: " + (a / b));

    }

    public void divide(double a, double b) {

            System.out.println("Division in double: " + (a / b));

    }
}

public class task02 {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        obj1.add(12, 3);
        obj1.subtraction(12, 3);
        obj1.multiplication(12, 3);
        obj1.divide(12, 3);

        obj1.add(12.5, 3.2);
        obj1.subtraction(12.5, 3.2);
        obj1.multipication(12.5, 3.2);
        obj1.divide(12.5,3.2);
    }
}