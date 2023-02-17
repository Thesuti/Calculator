import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    public char validateOperator(char operator) {
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

    public void calculate(long numberOne, long numberTwo, char operator) {
        if (operator == '+') {
            System.out.println("Result : " + (numberOne + numberTwo));
        } else if (operator == '-') {
            System.out.println("Result : " + (numberOne - numberTwo));
        } else if (operator == '/') {
            System.out.println("Result : " + (double) numberOne / numberTwo);
        } else if (operator == '*') {
            System.out.println(numberOne * numberTwo);
        } else if (operator == '^') {
            System.out.println("Result : " + (long) Math.pow((double) numberOne, (double) numberTwo));
        }
    }

    public long valideteNumber(String inputOne) {
        boolean isValid = false;
        long numberOne = 0;
        while (!isValid) {
            try {
                numberOne = Long.parseLong(inputOne);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("It is not a number. Please enter a number");
                inputOne = scanner.next();
            }
        }
        return numberOne;
    }
}
