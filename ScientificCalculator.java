import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        String operator;

        System.out.println("Welcome to Scientific Calculator!");

        // Get the first number
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // Get the operator
        System.out.print("Enter the operator (+, -, *, /, sin, cos, tan, sqrt): ");
        operator = scanner.next();

        if (operator.equals("sin") || operator.equals("cos") || operator.equals("tan") || operator.equals("sqrt")) {
            // Perform unary operations
            double result = performUnaryOperation(num1, operator);
            System.out.println(operator + "(" + num1 + ") = " + result);
        } else {
            // Get the second number
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            // Perform binary operations
            double result = performBinaryOperation(num1, num2, operator);
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }

    public static double performUnaryOperation(double num, String operator) {
        double result = 0.0;

        switch (operator) {
            case "sin":
                result = Math.sin(num);
                break;
            case "cos":
                result = Math.cos(num);
                break;
            case "tan":
                result = Math.tan(num);
                break;
            case "sqrt":
                result = Math.sqrt(num);
                break;
            default:
                System.out.println("Invalid operator. Please try again.");
        }

        return result;
    }

    public static double performBinaryOperation(double num1, double num2, String operator) {
        double result = 0.0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator. Please try again.");
        }

        return result;
    }
}