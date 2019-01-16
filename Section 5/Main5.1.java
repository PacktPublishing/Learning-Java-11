import java.util.Scanner;

public class Main {

    enum Operator {
        ERROR,
        ADD,
        SUB,
        MULT,
        DIV
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Operator op = Operator.ERROR;
        String line = scan.nextLine();
        if (line.equals("add")) {
            op = Operator.ADD;
        }
        else if (line.equals("sub")) {
            op = Operator.SUB;
        }
        else if (line.equals("mult")) {
            op = Operator.MULT;
        }
        else if (line.equals("div")) {
            op = Operator.DIV;
        }

        Calculator calc = new Calculator();
        switch (op) {
            case ADD: System.out.println(calc.add(1, 1)); break;
            case SUB: System.out.println(calc.sub(1, 1)); break;
            case MULT: System.out.println(calc.mult(1, 1)); break;
            case DIV: System.out.println(calc.div(1, 1)); break;
            case ERROR: System.out.println("Not a valid operator"); break;
        }
    }
}