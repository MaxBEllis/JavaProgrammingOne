package Chapter3;

import java.util.Scanner;

/**
 * Program to display a random number generated by the computer and have the
 * user guess the number and tell if the user is too high, too low, or correct
 *
 * @author Max Ellis
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        //first number
        System.out.println("Enter the first number: ");
        double number1 = input.nextDouble();

        //second number
        System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();

        if (number1 < number2) {
            System.out.println("The first number is less than the second.");
        }
        if (number1 > number2) {
            System.out.println("The first number is freater thant the second.");
        }
        if (number1 == number2) {
            System.out.println("The first number is equal to the second.");
        }
        if (number1 <= number2) {
            System.out.println("The first number is less than or equal to the second.");
        }
        if (number1 != number2) {
            System.out.println("The first number is not equal to the second.");
        }
        if (number2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (number1 / number2 < 1) {
            System.out.println("proper fraction.");
        } else {
            System.out.println("improper fraction.");
        }
        if (number1 >= 90.0) {
            System.out.println("A");
        } else if (number1 >= 80.0) {
            System.out.println("B");
        } else if (number1 >= 70.0) {
            System.out.println("C");
        } else if (number1 >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (number2 >= 1.0 && number1 <= 100.0) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
