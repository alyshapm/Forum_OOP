import java.util.Scanner; // import Scanner class for input
import java.lang.Math; // import Math class

public class Statistics {
    public static void mean(double x1, double x2, double x3) { // method to calculate mean, std and variance, with 3 different parameters
        // for bigger number of values, i'd use an array and loop
        double mean = (x1 + x2 + x3)/3; // formula for mean
        double variance = (Math.pow((x1 - mean), 2) + Math.pow((x2 - mean), 2) + Math.pow((x3 - mean), 2))/3; // formula for std
        double std = Math.sqrt(variance); // formula for variance

        // display result
        System.out.println("The mean is " + mean);
        System.out.println("The variance is " + variance);
        System.out.println("The standard deviation is " + std);
    }
    public static void main(String[] args) { // main where input takes place
        Scanner myObj = new Scanner(System.in);// create Scanner object

        System.out.println("To calculate mean, variance, and standard deviation, please enter the following:");
        System.out.print("Value for x1: ");
        double value1 = myObj.nextDouble();
        System.out.print("Value for x2: ");
        double value2 = myObj.nextDouble();
        System.out.print("Value for x3: ");
        double value3 = myObj.nextDouble();

        mean(value1, value2, value3); // call mean method, with each input as parameter
    }
}
