import java.util.Scanner;
 
public class C7_9 {
    public static void main(String[] args){
        double[] minimumElementArray = new double[10];
        
        insertNumbers(minimumElementArray);
        System.out.print("Smallest element: " + min(minimumElementArray));        
    }
    public static void insertNumbers(double[] minimumElementArray){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        
        for (int i = 0; i < 10; i++)
            minimumElementArray[i] = input.nextDouble();
        input.close();
    }
    public static double min(double[] array){
        double smallestElement = array[0];
        for (int i = 1; i < 10; i++)
            if (smallestElement > array[i])
                smallestElement = array[i];
        
        return smallestElement;
        
    }
}
