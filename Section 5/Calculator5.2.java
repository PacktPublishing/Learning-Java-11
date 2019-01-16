class Calculator extends Education {

    double add(double x, double y) {
        return x + y;
    }

    double sub(double x, double y) {
        return x - y;
    }

    double mult(double x, double y) {
        return x * y;
    }

    double div(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return x / y;
    }
}
