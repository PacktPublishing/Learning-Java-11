import java.util.Scanner;

public class Main {
    // x && y
    // x || y
    // !x
    // x == y
    // x != y
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1;
        int d2;
        d1 = scan.nextInt();
        d2 = scan.nextInt();
        if (d1 > 5) {
            System.out.println("d1 is greater than 5");
        }
        else if (d1 < 2) {
            System.out.println("d1 is less than 2");
        }
        System.out.println(d1 / d2);
    }
}