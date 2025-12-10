/* 5. Read a sentence from the user and:
- Convert to uppercase
- Show how many characters it contains
- Show the first character */

package my_package;

import java.util.Scanner;

public class SentenceCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sentence: ");
        String sentence = input.nextLine();


        String upper = sentence.toUpperCase();

        int length = sentence.length();

        char firstChar = upper.charAt(0);

        System.out.println("Uppercase: " + upper);
        System.out.println("Length: " + length);
        System.out.println("First Character: " + firstChar);
    }
}
