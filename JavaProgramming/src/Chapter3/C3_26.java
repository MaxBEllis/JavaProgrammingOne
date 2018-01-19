package Chapter3;

import java.util.Scanner;

/**
 * Program to display whether or not an integer is divisible by both 5 and 6, only
 * one, or neither
 *
 * @author Max Ellis
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        //user interaction
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        //calculation & results
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 and 6? True");
        } else {
            System.out.println("Is " + number + " divisible by 5 and 6? False");
        }
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6? True");
        } else {
            System.out.println("Is " + number + " divisible by 5 or 6? False");
        }
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? True");
        } else {
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? False");
        }

    }
}
