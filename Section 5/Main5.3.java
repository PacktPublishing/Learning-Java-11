import java.util.Scanner;

public class Main {

    // all available operators
    enum Operator {
        ERROR,
        ADD,
        SUB,
        MULT,
        DIV
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // infinite loop allowing infinite user input
        while (true) {
            // scan for user input
            Operator op = Operator.ERROR;
            String[] line = scan.nextLine().split(" "); // sub 1 9
            if (line[0].equals("add")) {
                op = Operator.ADD;
            }
            else if (line[0].equals("sub")) {
                op = Operator.SUB;
            }
            else if (line[0].equals("mult")) {
                op = Operator.MULT;
            }
            else if (line[0].equals("div")) {
                op = Operator.DIV;
            }

            // make sure user inputs correct amount of arguments
            if (line.length != 3) {
                System.out.println("Too many arguments");
                return;
            }
            double number1 = Double.parseDouble(line[1]);
            double number2 = Double.parseDouble(line[2]);

            // call the operator from the calculator class
            Calculator calc = new Calculator();
            switch (op) {
                case ADD: System.out.println(calc.add(number1, number2)); break;
                case SUB: System.out.println(calc.sub(number1, number2)); break;
                case MULT: System.out.println(calc.mult(number1, number2)); break;
                case DIV: System.out.println(calc.div(number1, number2)); break;
                case ERROR: System.out.println("Not a valid operator"); break;
            }
        }
    }
}