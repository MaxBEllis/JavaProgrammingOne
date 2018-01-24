package Chapter4;

import java.util.Scanner;

/**
 * Program to display if the first string of letters is a substring of the first
 * or not
 *
 * @author Max Ellis
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner 
        Scanner input = new Scanner(System.in);

        //user interaction
        System.out.print("Enter string s1: ");
        String s1 = input.next();
        System.out.print("Enter string s2: ");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.printf("%s is a substring of %s%n", s2, s1);
        } else {
            System.out.printf("%s is not a substring of %s%n", s2, s1);
        }
    }
}
