package Chapter6;

import java.util.Scanner;

/**
 * Program to display the conversion of Euors, Yen, or Dollars to each other
 * 
 * @author Max Ellis
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//variables
        String Answer;

//User interactions
        System.out.print("The number of euros it takes to equal a dollar is:  ");
        double EurosToDollars = input.nextDouble();
        System.out.print("The number of pound sterlings it takes to equal a dollar is: ");
        double PoundsToDollars = input.nextDouble();
        System.out.print("The number of yens it takes to equal a dollar is: ");
        double YensToDollars = input.nextDouble();

        do {     //begin of loop
            System.out.print("Enter how many dollars are you converting?: ");
            double dollars = input.nextDouble();
            System.out.print("What currency do you want to convert to? Enter 'E' for euros, 'P' for pounds, or 'Y' for yen: ");
            String ConvertTo = input.next().toUpperCase();
            switch (ConvertTo) {
                case "E":
                    double eurosBought = Conversion(dollars, EurosToDollars);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, eurosBought);
                    break;
                case "P":
                    double poundsBought = Conversion(dollars, PoundsToDollars);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, poundsBought);
                    break;
                case "Y":
                    double YenBought = Conversion(dollars, YensToDollars);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, YenBought);
                    break;
            }

//Final question to either loop again or end     
            do {
                System.out.println("Is there anything else you want to convert?");
                Answer = input.next().toUpperCase();
            } while (!Answer.equalsIgnoreCase("Yes") && !Answer.equalsIgnoreCase("No")); //if they dont enter a yes or no,the question will keep being asked

        } while (Answer.equalsIgnoreCase("Yes"));//if they enter a yes, then it will allow them to perform a new conversion
    }

    /**
     * method to convert the yen and dollars and euros
     *
     * @param d is named for dollars
     * @param c is named for conversions
     * @return Final total
     */
    public static double Conversion(double d, double c) {
        double FinalTotal;
        double fee;
        if (d <= 100) {
            fee = d * 0.10;
            FinalTotal = (d - fee) * c;
        } else {
            fee = d * 0.05;
            FinalTotal = (d - fee) * c;
        }
        return FinalTotal;
    }
}
