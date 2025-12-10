// 1. Ask the user to enter a password, if the password is '1234' print 'Login is successful' else print 'Wrong Password'.

package my_package;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the password: ");
        if (!input.hasNextInt())
            System.out.println("Invalid input!");
        int pass = input.nextInt();


        if (pass == 1234)
            System.out.println("Login is Successful");

        else
            System.out.println("Wrong Password");

    }
}
