public class Main {
    // <type> <variable_name> = <value>
    // int total;
    // total = 0;
    // total = total + 5;
    // String message;
    // message = "Hello";
    // System.out.println(message);
    public static void main(String[] args) {
        // example of boolean
        boolean foo = true;
        boolean bar = false;
        System.out.println("foo = " + foo + ". bar = " + bar);

        // example of char
        char letter = 'A';
        System.out.println("letter = " + letter);

        // example of integer type (byte, short, int, long)
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);

        // double example (also float)
        double size = 0.2342234345;
        double area = 63.54632;
        System.out.println(size + " times " + area + " equals " + (size * area));

        // string example
        String word = "Hello World!";
        String wordTrue = "Hello World!";
        String wordFalse = "Random";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.equals(wordTrue));
        System.out.println(word.equals(wordFalse));

        // default values
        boolean d = false; // false
        String s; // null
        int i; // 0

    }
}