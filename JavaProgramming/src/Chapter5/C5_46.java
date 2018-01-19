package Chapter5;

import java.util.Scanner;

/*
 * Program to show the entered string backwards
 * 
 * @author Max Ellis
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        //scanner
        Scanner input = new Scanner(System.in);

        //user interaction
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        new StringBuffer(s).reverse().toString();
        System.out.printf("The reversed string is ", s);
    }
}
