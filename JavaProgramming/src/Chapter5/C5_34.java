package Chapter5;

import java.util.Scanner;

/**
 * Progam made to play Rock, Paper, Scissors with the user
 *
 * @author Max Ellis
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int computerCount = 0, playerCount = 0;
        int computer_choice = 0, player_choice = 0;

        //loop
        do {
            //computer choice
            computer_choice = (int) (Math.random() * 3);
            // 0 = paper, 1 = rock, 2 = scissors

            //player choice
            System.out.println("Paper (0), Rock (1), or Scissors (2)?");
            player_choice = input.nextInt();

            //tie
            if (computer_choice == player_choice) {
                System.out.println("It's a tie! You and the computer both chose the same thing!");
            } //player chooses paper
            //win
            else if (player_choice == 0 && computer_choice == 1) {
                System.out.println("You chose PAPER, computer chose ROCK");
                System.out.println("That means you won! Congrats!");
                playerCount++;

            } //lose
            else if (player_choice == 0 && computer_choice == 2) {
                System.out.println("You chose PAPER, Computer chose SCISSORS...");
                System.out.println("Sorry but that means you lost.");
                computerCount++;
            } //player chooses rock
            //win
            else if (player_choice == 1 && computer_choice == 2) {
                System.out.println("You chose ROCK, computer chose SCISSORS");
                System.out.println("That means you won! Congrats!");
                playerCount++;
            } //lose
            else if (player_choice == 1 && computer_choice == 0) {
                System.out.println("You chose ROCK, Computer chose PAPER...");
                System.out.println("Sorry but that means you lost.");
                computerCount++;
            } //player chooses Scissors
            //win
            else if (player_choice == 2 && computer_choice == 0) {
                System.out.println("You chose SCISSORS, computer chose PAPER");
                System.out.println("That means you won! Congrats!");
                playerCount++;
            } //lose
            else if (player_choice == 2 && computer_choice == 1) {
                System.out.println("You chose SCISSORS, Computer chose ROCK...");
                System.out.println("Sorry, but that means you lost.");
                computerCount++;
            }
        } while (playerCount < 2 && computerCount < 2);

    }

}
