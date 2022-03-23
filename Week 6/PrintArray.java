import java.util.Scanner; // import scanner for user input
import java.util.Arrays; // import Array library to print array

public class PrintArray {
    public static void main(String[] mie) {
        Scanner myObj = new Scanner(System.in); // create scanner object
         
        System.out.print("Enter number of items: ");

        int NUM_ITEMS = myObj.nextInt();
        int[] items = new int[NUM_ITEMS]; // initialise int array with length NUM_ITEMS

        System.out.print("\nEnter the value of all items (separated by space): ");

        for (int i = 0; i < NUM_ITEMS; i++){
            items[i] = myObj.nextInt(); // using loop, insert items into array iteratively
        }

        System.out.print("\nThe values are: ");
        System.out.print(Arrays.toString(items)); // display array
        System.out.print("\n");

        myObj.close();
    }
}