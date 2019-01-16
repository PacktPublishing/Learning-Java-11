import java.lang.reflect.Array;
import java.util.ArrayList;

class BasicCalculator implements Calculator {

    @Override
    public double add(ArrayList<Double> numbers) {
        double sum = 0;
        // for each double in numbers
        for (double d : numbers) {
            sum += d;
        }
        return sum;
    }

    @Override
    public double sub(ArrayList<Double> numbers) {
        double num = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            num -= numbers.get(i);
        }
        return num;
    }

    @Override
    public double mult(ArrayList<Double> numbers) {
        double num = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            num *= numbers.get(i);
        }
        return num;
    }

    @Override
    public double div(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return x / y;
    }

    // 0 1 1 2 3 5 8 ...
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    public int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n-1);
    }
}
