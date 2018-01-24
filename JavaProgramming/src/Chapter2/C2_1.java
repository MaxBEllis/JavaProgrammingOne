package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit
 *
 * @author Max Ellis
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        //user interaction
        System.out.print("Enter a degree in Celsius: ");
        double celsius = 0;
        double fahrenheit;
        fahrenheit = (int) ((9.0 / 5) * celsius + 32);

        System.out.print(+celsius + " Celsius is " + fahrenheit);
    }
}
