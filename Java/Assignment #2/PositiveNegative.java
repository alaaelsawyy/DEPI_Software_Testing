// 2. Ask the user to enter a number, if the number is greater than or equal to zero print 'The Number is Positive' else print 'The Number is Negative'.

package my_package;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        if (!input.hasNextInt())
            System.out.println("Invalid input!");
        int num = input.nextInt();


        if (num >= 0)
            System.out.println("The Number is Positive");

        else
            System.out.println("The Number is Negative");

    }

}
