class BasicCalculator implements Calculator {

    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public double mult(double x, double y) {
        return x * y;
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
