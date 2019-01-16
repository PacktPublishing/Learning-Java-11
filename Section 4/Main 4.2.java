public class Main {
    // Exception? an exception is an object that signals the occurrence
    // of an unusual event during the execution of a program
    public static void main(String[] args) {
        try {
            double value = divide(10, 0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static double divide(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return x / y;
    }
}