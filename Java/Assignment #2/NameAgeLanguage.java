/* 4. Write a program that:
- Asks the user for their name, age, and favorite programming language.
- Calculates their age in months.
- Uses the ++ operator to show their age next year */

package my_package;

import java.util.Scanner;

public class NameAgeLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you name: ");
        String name = input.nextLine();


        System.out.println("Enter your age: ");
        if (!input.hasNextInt())
            System.out.println("Invalid input!");
        int age = input.nextInt();
        int ageMonth = age * 12;


        System.out.println("Enter your Favourite programming language: ");
        String programmingLanguage = input.nextLine();


        System.out.println("\nHello! My name is "+ name);
        System.out.println("I am "+ age + " years old, which is " + ageMonth + " months");
        System.out.println("My favourite programming language is "+ programmingLanguage);
        System.out.println("Next year i will be " + (++age) + " years old");

    }
}
