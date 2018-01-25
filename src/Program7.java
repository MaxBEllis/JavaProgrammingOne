import java.util.Scanner;
import java.util.Arrays;
public class Program7 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double[] numbers;
        System.out.println("How many numbers will be read: ");
        int arraysize = input.nextInt();
        numbers = new double[arraysize];       
        input(numbers, arraysize);
        System.out.println("The average is " + average(numbers, arraysize));
        System.out.println("The contents of the array: " + Arrays.toString(numbers));      
    }
    public static void input(double[] array, int arraysize) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter " + arraysize + " elements: ");
        for (int i = 0; i < arraysize; i++){
            array[i] = input.nextDouble();        
        }
       average(array, arraysize);     
    }
    public static double average (double[] array, int arraysize){
        double average = 0;
                for (int i = 0; i < arraysize; i++){
                    average += array[i];                    
                }
                average = (average / arraysize);
                return average ;
    }
}
