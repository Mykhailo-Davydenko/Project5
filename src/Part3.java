import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");

        System.out.println("Enter first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        double number2 = scanner.nextDouble();

        double result = 0;

        if (operator == '+') {
            result = addNumbers(number1, number2);
        }
        else if (operator == '-') {
            result = subtractNumbers(number1, number2);
        }
        else if (operator == '*') {
            result = multiplyNumbers(number1, number2);
        }
        else if (operator == '/') {
            result = divideNumbers(number1, number2);
        }
        else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result is " + result);
    }


    public static double addNumbers(double number1, double number2) {
        return number1 + number2;
    }


    public static double subtractNumbers(double number1, double number2) {
        return number1 - number2;
    }


    public static double multiplyNumbers(double number1, double number2) {
        return number1 * number2;
    }


    public static double divideNumbers(double number1, double number2) {
        return number1 / number2;
    }
}