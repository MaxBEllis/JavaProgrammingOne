package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to tell how many elements are in an array
 *
 * @author Max Ellis
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] elements;
        System.out.print("How many number will this array read?: ");
        int length = input.nextInt();
        elements = new double[length];

        input(elements, length);
        System.out.print("The average is " + average(elements, length));
        System.out.print(Arrays.toString(elements));
    }

    /**
     * Method to show how many values are within the array
     *
     * @param array stores the numbers entered by the user
     * @param length the length of the array
     */
    public static void input(double[] array, int length) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + length + " elements: ");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextDouble();
        }
        average(array, length);
    }

    /**
     * Method to calculate the average of the array and length
     *
     * @param array the variable that is storing the users input
     * @param length the length of the array
     * @return the value of the variable average
     */
    public static double average(double[] array, double length) {
        double average = 0;
        for (int counter = 0; counter < length; counter++) {
            average += array[counter];
        }
        average = (average / length);
        return average;
    }
}
