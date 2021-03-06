import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

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

    public HashSet<Double> set(ArrayList<Double> numbers) {
        HashSet<Double> s = new HashSet<Double>();
        for (double d : numbers) {
            s.add(d);
        }
        return s;
    }

    public TreeMap<Double, String> fifty(ArrayList<Double> numbers) {
        TreeMap<Double, String> temp = new TreeMap<Double, String>();
        for (double d : numbers) {
            double coin = Math.random();
            if (coin > 0.5) {
                temp.put(d, "Head");
            }
            else {
                temp.put(d, "Tail");
            }
        }
        return temp;
    }
}
