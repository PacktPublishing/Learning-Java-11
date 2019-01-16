public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator(300);
        System.out.println(calc.getVariable());
        calc.setVariable(10);
        System.out.println(calc.getVariable());
    }
}