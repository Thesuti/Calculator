import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Hello! This is a command line calculator.");
        System.out.println("Please provide the first number: ");
        long numberOne = calculator.valideteNumber(scanner.next());
        System.out.println("Please provide an operator.");
        char operator = calculator.validateOperator(scanner.next().charAt(0));
        System.out.println("Please provide the second number: ");
        long numberTwo =calculator.valideteNumber(scanner.next());
        calculator.calculate(numberOne, numberTwo, operator);
    }


}