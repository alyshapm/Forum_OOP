import java.util.Scanner; // import Scanner class for input
import java.lang.Math; // import Math class

public class Quadratic {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create a Scanner object

        // takes in 3 values to calculate the roots of a polynomial
        System.out.print("Enter value for a: ");
        double a = myObj.nextDouble(); // read user input for a
        System.out.print("Enter value for b: ");
        double b = myObj.nextDouble(); // read user input for b
        System.out.print("Enter value for c: ");
        double c = myObj.nextDouble(); // read user input for c

        // determines whether the equation contains 0, 1 or 2 roots using discriminant formula
        double evalRoot = Math.pow(b, 2) - 4*a*c;

        // if the discriminant is bigger than 0, then there exists 2 distinct roots
        if (evalRoot > 0) {
            double x1 = (-b + Math.sqrt(evalRoot))/(2*a);
            double x2 = (-b - Math.sqrt(evalRoot))/(2*a);
            System.out.println("The equation has two distinct roots, x = " + x1 + " and x = " + x2);
        } else if (evalRoot == 0) { // if the discriminant equals to 0, there exists one distinct root
            double x1 = -b / (2*a);
            System.out.println("The equation has one distinct root, x = " + x1);
        } else { // if the discriminant is less than 0, then the solution or roots does not exist
            System.out.println("The values of x does not exist for this equation.");
        }
    }
}
