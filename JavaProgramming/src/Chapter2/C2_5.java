package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate the total cost from the given subtotal, gratuity rate,
 * and gratuity
 *
 * @author Max Ellis
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //user interaction
        System.out.print("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total is $"
                + total);
    }
}
