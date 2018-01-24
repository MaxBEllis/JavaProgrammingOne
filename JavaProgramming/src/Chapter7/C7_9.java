package Chapter7;

import java.util.Scanner;

/**
 * Program to find the smallest element from the entered amount
 *
 * @author Max Ellis
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double[] minimumElementArray = new double[10];

        insertNumbers(minimumElementArray);
        System.out.print("Smallest element: " + min(minimumElementArray));
    }

    /**
     * Method to print out the provided statement and make it loop 10 times
     *
     * @param minimumElementArray arguments from command line prompt
     */
    public static void insertNumbers(double[] minimumElementArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            minimumElementArray[i] = input.nextDouble();
        }
        input.close();
    }

    /**
     * Method to make the variable smallestElement equal to the array
     *
     * @param array arguments from command line prompt
     * @return the variable smallestElement
     */
    public static double min(double[] array) {
        double smallestElement = array[0];
        for (int i = 1; i < 10; i++) {
            if (smallestElement > array[i]) {
                smallestElement = array[i];
            }
        }

        return smallestElement;

    }
}
