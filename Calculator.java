package Expt2;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Factorial");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1: // Addition
                System.out.println("Enter second number:");
                double num2 = scanner.nextDouble();
                result = add(num1, num2);
                break;
            case 2: // Subtraction
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                result = subtract(num1, num2);
                break;
            case 3: // Multiplication
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                result = multiply(num1, num2);
                break;
            case 4: // Division
                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            case 5: // Factorial
                if (num1 < 0 || num1 != (int) num1) {
                    System.out.println("Error! Factorial of a negative or non-integer number doesn't exist.");
                    return;
                }
                result = factorial((int) num1);
                break;
            default:
                System.out.println("Invalid operation choice!");
                return;
        }

        System.out.println("The result is: " + result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static int factorial(int a) {
        if (a < 0) {
            System.out.println("Error! Factorial of a negative number doesn't exist.");
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
}
