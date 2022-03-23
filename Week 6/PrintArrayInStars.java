import java.util.Scanner; // scanner for user input

public class PrintArrayInStars {
    public static void main(String[] mie) {
        Scanner myObj = new Scanner(System.in); // create scanner object
         
        System.out.print("Enter number of items: ");

        int NUM_ITEMS = myObj.nextInt();
        int[] items = new int[NUM_ITEMS]; // initialise array with length specified by user (NUM ITEMS)

        System.out.print("\nEnter the value of all items (separated by space): ");

        for (int i = 0; i < NUM_ITEMS; i++){
            items[i] = myObj.nextInt(); // items inserted into array using a loop
            String starRepeatStr = "*".repeat(items[i]); // declare String for the star, which will be repeated according to the value of the index (item)
            System.out.println(i + ": " + starRepeatStr + "(" + items[i] + ")"); // display index, stars and the value
        }

        myObj.close();
    }
}
