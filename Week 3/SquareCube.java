import java.util.Formatter; // the Formatter class provide layout justification and alignment.
// I'll be using it to output the table.

public class SquareCube {
    public static void main(String[] args) {
        double num[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // declare array

        Formatter table = new Formatter(); // create a Formatter object

        table.format("%15s %15s %15s\n", "number", "square", "cube"); // arrange the format of the table
        for (double i : num) { // using loop, insert number and apply calculation for square and cube in the formatted table for each number in the array
            table.format("%14.0f %14.0f %15.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
        }
        System.out.println(table);// print table
    }
}