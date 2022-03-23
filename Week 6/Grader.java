import java.util.Scanner; // import scanner for user input

public class Grader { 
    public static double getAvgGrade(int[] arr){ // function to calculate average grade, and accepts an array (of grades) as parameter
        int arrTotal = 0; // declare var to store cumulative total of array content
        for (int i=0; i<arr.length; i++){
            arrTotal += arr[i]; // adds all the grades in array
        }
        double avgGrade = arrTotal / arr.length; // average formula
        return avgGrade;
    }

    public static int getMinGrade(int[] arr){ // function to return the min of array 
        int temp;
        for (int i = 0; i < arr.length; i++){ // sorts the array from the smallest to biggest
            for (int j = i + 1; j < arr.length; j++){ 
                if (arr[i] > arr[j]){// loop and compare the value of the first index [i] with every subsequent index [j=i+1] until it meets the condition where arr[i] > arr[j]
                    temp = arr[i];// if the value from the first index is bigger than the second, it will be stored in a third, temporary variable called temp
                    arr[i] = arr[j]; // swapping takes place
                    arr[j] = temp; // the bigger value is placed in the index where the smaller value was
                }
            }
        }  
        return arr[0]; // the first index now contains the min value and is returned
    }

    public static int getMaxGrade(int[] arr){ // function to return the max of array
        int temp;  
        for (int i = 0; i < arr.length; i++){ // sorts the value of array from large to small
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){ // if the value in the first index i is smaller than the subsequent index j, swapping takes place
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }  
        return arr[0]; // the first index now contains the largest value and is returned
    }

    public static void main(String[] mie) {
        Scanner myObj = new Scanner(System.in); // create object scanner

        System.out.print("Enter number of students: ");
        int numStudents = myObj.nextInt();

        int[] grades = new int[numStudents]; // intiialise array with length of numStudents

        for (int i=0; i<numStudents; i++){
            System.out.printf("Enter the grade for student %d: ", i+1); // prompt user to enter grade N times (N = number of students as specified)
            grades[i] = myObj.nextInt();
        }

        System.out.println("The average is: " + getAvgGrade(grades)); // call functions and displays average, min and max
        System.out.println("The minimum is: " + getMinGrade(grades));
        System.out.println("The maximum is: " + getMaxGrade(grades));

        myObj.close();
    }
}
