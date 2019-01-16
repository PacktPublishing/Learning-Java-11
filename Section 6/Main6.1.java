import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    // all available operators
    enum Operator {
        ERROR,
        ADD,
        SUB,
        MULT,
        DIV,
        FIB,
        FACT
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
            else if (line[0].equals("fib")) {
                op = Operator.FIB;
            }
            else if (line[0].equals("fact")) {
                op = Operator.FACT;
            }

            // numbers arraylist
            ArrayList<Double> numbers = new ArrayList<Double>();

            // make sure user inputs correct amount of arguments
            if (line.length < 2) {
                System.out.println("Incorrect arguments");
                return;
            }
            for (int i = 1; i < line.length; i++) {
                numbers.add(Double.parseDouble(line[i]));
            }

            // call the operator from the calculator class
            BasicCalculator calc = new BasicCalculator();
            switch (op) {
                case ADD: System.out.println(calc.add(numbers)); break;
                case SUB: System.out.println(calc.sub(numbers)); break;
                case MULT: System.out.println(calc.mult(numbers)); break;
                case DIV: System.out.println(calc.div(numbers.get(0), numbers.get(1))); break;
                case FIB: System.out.println(calc.fib((int)numbers.get(0).doubleValue())); break;
                case FACT: System.out.println(calc.fact((int)numbers.get(0).doubleValue())); break;
                case ERROR: System.out.println("Not a valid operator"); break;
            }
        }
    }
}