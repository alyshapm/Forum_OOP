import java.util.Scanner; // import Scanner class for input

public class Converter {
    public static void main(String[] args) {
        double fahrenheit; // initilise fahrenheit
        
        Scanner myObj = new Scanner(System.in); // create a Scanner object

        System.out.println("Enter Celsius: "); 
        double celsius = myObj.nextDouble(); // read user input

        fahrenheit = ((celsius*9)/5) + 32; // calculate fahrenheeit with formula and user input
        System.out.println(celsius + " Celsius degrees are " + fahrenheit + " in Fahrenheit."); // output result
      }
}