public class Calculator {
    private int variable = 5;
    public Calculator(int variable) {
        this.variable = variable;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public double divide(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return x / y;
    }


    public int getVariable() {
        return variable;
    }
    public void setVariable(int variable) {
        this.variable = variable;
    }
}
