package Chapter7;

import java.util.Scanner;

/**
 * Program to compare the entered strings to each other and say if they are
 * identical or not
 *
 * @author Max Ellis
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter list 1: ");
        int[] arrayList1 = new int[input.nextInt()];
        filllist(arrayList1);

        System.out.print("Enter list 2: ");
        int[] arrayList2 = new int[input.nextInt()];
        filllist(arrayList2);

        if (equals(arrayList1, arrayList2)) {
            System.out.print("Two lists are strictly identical");
        } else {
            System.out.print("Both list are not strictly identical");
        }

    }

    /**
     * Method to compare the two length of each string
     *
     * @param arrayList
     */
    public static void filllist(int[] arrayList) {
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = input.nextInt();
        }
    }

    /**
     * Method to
     *
     * @param list1
     * @param list2
     * @return true or false
     */
    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

}
