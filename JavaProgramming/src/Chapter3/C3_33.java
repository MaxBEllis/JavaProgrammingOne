package Chapter3;

import java.util.Scanner;

/**
 * Program to display the better deal of a package that is entered by the user
 *
 * @author Max Ellis
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt user to enter weight and price
        //package one        
        System.out.print("Enter weight and price for package one: ");
        double weight = input.nextDouble();
        double price = input.nextDouble();

        //package two        
        System.out.print("Enter weight and price for package two: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        //calculation
        double packageone = price / weight;
        double packagetwo = price2 / weight2;

        //results
        if (packagetwo > packageone) {
            System.out.println("Package 1 has a better price.");
        } else if (packageone == packagetwo) {
            System.out.println("Both packages have the same price.");
        } else {
            System.out.println("Package 2 has a better prices.");
        }

    }
}
