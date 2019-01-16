import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        File infile = new File("myfile.txt");
        try {
            Scanner scan = new Scanner(infile);
            while (scan.hasNext()) {
                System.out.println(scan.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            PrintWriter output = new PrintWriter(infile);
            output.println(19.5);
            output.println("Pretty cool");
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static double divide(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return x / y;
    }
}