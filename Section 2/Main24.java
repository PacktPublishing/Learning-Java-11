import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String d1;
        String d2;
        d1 = scan.nextLine();
        d2 = scan.nextLine();
        System.out.println(Double.parseDouble(d1) + Double.parseDouble(d2));
    }
}