import java.util.Scanner; // import Scanner object for input

public class TimeConverter {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // create Scanner object

        System.out.println("Enter seconds: ");
        int seconds = myObj.nextInt(); // reads user input

        int convertHours = seconds/3600; 
        int convertMinutes = (seconds%3600)/60;
        int convertSeconds = seconds%60;

        System.out.printf("%d seconds are %02d:%02d:%02d\n", seconds, convertHours, convertMinutes, convertSeconds);
    }
}
