import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // switch (test value)
        // case value1: statement; [break;]
        // default: statement
        System.out.print("Enter in a character: ");
        char ch = scan.nextLine().charAt(0);
        switch (ch) {
            case '+':
            case '-': System.out.println("A minus"); break;
            default: System.out.println("none of the above are true");
        }
    }
}