import java.util.Scanner;
 
public class C7_26 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
 
        System.out.print("Enter list 1: ");
        int[] arrayList1 = new int[input.nextInt()];
        filllist(arrayList1);
        
        System.out.print("Enter list 2: ");
        int[] arrayList2 = new int[input.nextInt()];
        filllist(arrayList2);
        
        if (equals(arrayList1, arrayList2))
            System.out.print("Two lists are strictly identical");
        else
            System.out.print("Both list are not strictly identical");
        
    }
    public static void filllist(int[] arrayList){
        for (int i = 0; i < arrayList.length; i++)
            arrayList[i] = input.nextInt();
    }
            
    public static boolean equals(int[] list1, int[] list2){
        for (int i = 0; i < list1.length; i++)
            if (list1[i] != list2[i])
                return false;
        return true;
    }
            
}
