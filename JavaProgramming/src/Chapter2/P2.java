package Chapter2;

import java.util.Scanner;

/**
 * Program to display the cost of a meal, a drink, and the dessert entered by
 * the user
 *
 * @author Max Ellis
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cost of the meal, the drink, and dessert: ");
        //user interaction
        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();

        //food expense & calculation of tax & tip
        double food = meal + drink + dessert;
        double tax = food * 0.10;
        double tip = 0.15 * (food + tax);

        //total  cost
        double cost = food + tax + tip;

        //display
        System.out.println(" The price of the food is $" + food + ", The cost of"
                + " tax is $" + tax + ", the tip is $" + tip + ", and the total cost of the"
                + " of the meal is $" + cost);
    }
}
