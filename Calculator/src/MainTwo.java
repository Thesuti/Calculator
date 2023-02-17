import java.util.Scanner;

public class MainTwo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        var calculator = new Calculator();
        boolean quit = false;
        long result = 0;
        while (!quit){
            long temp = 0;
            System.out.println("Operator: ");
            char operator = calculator.validateOperator(scanner.next().charAt(0));
            System.out.println("Number: ");
            temp = calculator.valideteNumber(scanner.next());
            result = calculator.calculateWithReturn(result,temp,operator);
            System.out.println("Result "+result);
        }
    }
}
