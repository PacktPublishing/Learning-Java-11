import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
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
        FACT,
        SET,
        FIFTY
    }

    public static void main(String[] args) {
        // DECLARE
        int[][] arr = new int[][] {{1, 2}, {3, 4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


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
            else if (line[0].equals("set")) {
                op = Operator.SET;
            }
            else if (line[0].equals("fifty")) {
                op = Operator.FIFTY;
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
                case SET: System.out.println(calc.set(numbers)); break;
                case FIFTY: System.out.println(calc.fifty(numbers)); break;
                case ERROR: System.out.println("Not a valid operator"); break;
            }
        }
    }
}