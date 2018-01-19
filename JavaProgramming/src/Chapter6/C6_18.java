package Chapter6;

import java.util.Scanner;

/*
 * This program will check if an entered string is a vaild password
 * 
 * @author Max Ellis
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user interaction
        System.out.println("Your password must have at least eight characters."
                + "\nYour password must consist of only letters and digits."
                + "\nYour password must contain at least two digits");
        System.out.println("Enter your password: ");
        if (checkPassword(input.next())) {
            System.out.print("Valid Password");
        } else {
            System.out.println("Invaild Password");
        }

        input.close();
    }

    /**
     *
     * @param password is the password the user enters
     * @return true or false
     */
    public static boolean checkPassword(String password) {
        if (checkLength(password)) {
            if (onlyLetterDigits(password)) {
                return atLeast2Digits(password);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     *
     * @param password makes sure the string is at least 2 digits
     * @return counter number if it's greater than 2
     */
    public static boolean atLeast2Digits(String password) {
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                counter++;
            }
        }
        return counter >= 2;
    }

    /**
     *
     * @param password makes sure only letters are within the string
     * @return true or false
     */
    public static boolean onlyLetterDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param password makes sure the length is seven or greater
     * @return the password length
     */
    public static boolean checkLength(String password) {
        return password.length() > 7;
    }
}
