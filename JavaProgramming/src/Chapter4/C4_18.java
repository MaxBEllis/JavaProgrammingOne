package Chapter4;

import java.util.Scanner;

/**
 * Program to display the grade and the class the user is taking based off of
 * what they entered
 *
 * @author Max Ellis
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //user interaction
        System.out.print("Enter two characters: ");
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);

        //calculation
        if (c != '1' && c != '2' && c != '3' && c != '4') {
            System.out.println("Invaild input, only enter numbers 1 - 4 ");
            System.exit(0);
        }
        //status
        switch (b) {
            case 'M':
                System.out.println("Mathamatics");
                break;
            case 'C':
                System.out.println("Computer Science");
                break;
            case 'I':
                System.out.println("Information Technology");
                break;
            default:
                System.out.println("Please only enter the characters 'M', 'C', or 'I'");
                System.exit(0);
        }

        //major
        switch (c) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            default:
                System.out.println("Senior");
        }
    }
}
