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

    public int fib(int n) {
        return 0;
    }

    public int fact(int n) {
        return 0;
    }
}
