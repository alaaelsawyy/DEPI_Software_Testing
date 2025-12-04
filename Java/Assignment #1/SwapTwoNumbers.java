// Write a program that stores two integer values and swap them without using a third variable.

package My_Package;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int x = 4;
        int y = 5;

        x = x + y;    // x = 9
        y = x - y;    // y = 4
        x = x - y;    // x = 5

        System.out.println("After swapping: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
