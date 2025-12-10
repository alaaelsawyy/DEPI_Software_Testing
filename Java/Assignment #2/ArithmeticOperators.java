/* 3. Create a Java program that takes two numbers and performs:
Addition, Subtraction, Multiplication, Division. */

package my_package;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        if (!input.hasNextDouble())
            System.out.println("Invalid input!");
        double num1 = input.nextDouble();


        System.out.println("Enter the second number: ");
        if (!input.hasNextDouble())
            System.out.println("Invalid input!");
        double num2 = input.nextDouble();


        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0)
            System.out.println("Division: " + (num1 / num2));
        else
            System.out.println("Division: Cannot divide by zero!");

    }
}
