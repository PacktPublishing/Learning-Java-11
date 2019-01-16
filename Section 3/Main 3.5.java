import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // <type>[] <name> = new <type>[<size>]
        int[] myArray = new int[] {1,2,3,4};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("index i: " + i + "= " + myArray[i]); // 0... n-1
        }
        System.out.println(myArray[10]);
    }
}