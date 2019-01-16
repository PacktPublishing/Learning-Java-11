import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // best used for with arrays
        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j >= 0; j--) {
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }
}