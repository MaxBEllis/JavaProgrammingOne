package Chapter2;

import java.util.Scanner;

/**
 * Program to display the radius and length of a cylinder which is entered by
 * the user
 *
 * @author Max Ellis
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        //user interaction
        System.out.print("Enter the radius and length of cylinder: ");

        double radius = input.nextDouble();
        double length = input.nextDouble();
        double MathPI = 3.14159;

        //formula for area
        double area = radius * radius * MathPI;
        System.out.println(" The area is " + area);

        //formula for volume
        double volume = area * length;
        System.out.println(" The volume is " + volume);
    }
}
