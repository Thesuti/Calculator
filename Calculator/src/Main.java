import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello! This is a command line calculator.");
        System.out.println("Please provide the first number: ");
        int numberOne = valideteNumber(scanner.next());
        System.out.println("Please provide an operator.");
        char operator = validateOperator(scanner.next().charAt(0));
        System.out.println("Please provide the second number: ");
        int numberTwo = valideteNumber(scanner.next());
        calculate(numberOne, numberTwo, operator);
    }

    private static char validateOperator(char operator) {
        boolean isValid = false;
        List<Character> validOperatorList = new ArrayList<>(List.of('+', '-', '*', '/', '^'));
        while (!isValid) {
            if (validOperatorList.contains(operator)) {
                isValid = true;
            } else {
                System.out.println("It is not a valid operator. Please provide a valid operator");
                operator = scanner.next().charAt(0);
            }
        }
        return operator;
    }

    private static void calculate(int numberOne, int numberTwo, char operator) {
        if (operator == '+') {
            System.out.println("Result : " + (numberOne + numberTwo));
        } else if (operator == '-') {
            System.out.println("Result : " + (numberOne - numberTwo));
        } else if (operator == '/') {
            System.out.println("Result : " + (double) numberOne / numberTwo);
        } else if (operator == '*') {
            System.out.println(numberOne * numberTwo);
        } else if (operator == '^') {
            System.out.println("Result : " + (int) Math.pow((double) numberOne, (double) numberTwo));
        }
    }

    private static int valideteNumber(String inputOne) {
        boolean isValid = false;
        int numberOne = 0;
        while (!isValid) {
            try {
                numberOne = Integer.parseInt(inputOne);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("It is not a number. Please enter a number");
                inputOne = scanner.next();
            }
        }
        return numberOne;
    }
}