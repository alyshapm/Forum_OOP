public class SwapVar {
    public static void main(String[] args) {
        int x, y, z; // initialise x, y and z
        x = 10;
        y = 5;
        System.out.println("Before, x is " + x + " and y is " + y);

        z = x; // the third variable temporarily holds the value of x and swapping takes place
        x = y;
        y = z; // the value of x returns to y
        System.out.println("When exchanged, x will become " + x + " and y will become " + y);
    }
}
