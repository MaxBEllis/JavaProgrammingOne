package Chapter4;

import java.util.Scanner;

/**
 * Program to display the entered name and the hours they worked along with the
 * hourly pay rate and the federal and state tax then finally output their final
 * pay
 *
 * @author Max Ellis
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //scanner 
        Scanner input = new Scanner(System.in);

        //user interaction & variables
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        //variables
        double grossPay = hoursWorked * payRate;
        //federal and state withholding values
        double federalw = fedTax * grossPay;
        double statew = stateTax * grossPay;
        double totalD = federalw + statew; //total deduction
        double netPay = grossPay - totalD;

        //output
        System.out.printf("\nEmployee name: %s", name);
        System.out.printf("\n Hours Worked: %.2f", hoursWorked);
        System.out.printf("\n Pay Rate: $%.2f ", payRate);
        System.out.printf("\nGross Pay: $%.2f", grossPay);
        System.out.printf("\nDeductions: ");
        System.out.printf("\nFederal Withholding: $%.2f", federalw);
        System.out.printf("\nState Withholding: $%.2f", statew);
        System.out.printf("\nTotal Deductions: $%.2f", totalD);
        System.out.printf("\nNet Pay: $%.2f", netPay);
    }
}
