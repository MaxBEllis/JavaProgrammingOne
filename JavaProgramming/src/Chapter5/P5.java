package Chapter5;

import java.util.Scanner;

/*
 * Program is a voting system for the user
 * 
 * @author Max Ellis
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //variables
        int YesVote = 0;
        int NoVote = 0;

        //user interaction
        String Voter;
        Scanner input = new Scanner(System.in);
        System.out.println("Please vote. Enter Yes(Y), or No(N), or to Quit voting(Q): ");
        Voter = input.next().toLowerCase();

        //loop
        while (!Voter.equals("q")) {
            switch (Voter) {
                case "y":
                    ++YesVote;
                    break;
                case "n":
                    ++NoVote;
                    break;
                default:
                    System.out.println("Invalid Answer! Please enter only Y, N, or Q.");
                    break;

            }//end of loop

            System.out.println("Please vote Yes(Y), or No(N), or to Quit voting(Q): ");
            Voter = input.next().toLowerCase();
        }
        System.out.println("Votes for Yes: " + YesVote);
        System.out.println("Votes for No: " + NoVote);
    }
}
