package Chapter3;

import java.util.Scanner;

/**
 * Program to display a game of heads or tails where the user can enter their
 * guess and it tells them whether or not they are correct
 *
 * @author Max Ellis
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        //user interaction
        System.out.println("Can you guess the flip of a coin? 1 for Heads"
                + " 0 for Tails");
        int answer = input.nextInt();

        //random generation
        int coin = (int) (Math.random() * 2);

        //results
        if (coin == 1) {
            System.out.println("The flip of the coin was Heads.");
        } else {
            System.out.println("The flip of the coin was Tails");
        }

        if (answer == coin) {
            System.out.print("You are correct.");
        } else {
            System.out.println("Sorry, better luck next time.");
        }
    }

}
